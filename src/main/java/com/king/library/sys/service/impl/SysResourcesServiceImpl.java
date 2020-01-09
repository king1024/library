package com.king.library.sys.service.impl;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.king.library.common.constants.StatusEnum;
import com.king.library.common.model.PageVo;
import com.king.library.common.model.ResponseVo;
import com.king.library.common.model.TreeNode;
import com.king.library.common.tools.CommonUtil;
import com.king.library.common.tools.StringTools;
import com.king.library.sys.mapper.SysResourcesMapper;
import com.king.library.sys.pojo.SysResources;
import com.king.library.sys.service.SysResourcesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author duanyong
 * @since 2019-12-27
 */
@Service
public class SysResourcesServiceImpl extends ServiceImpl<SysResourcesMapper, SysResources> implements SysResourcesService {

    @Autowired
    private SysResourcesMapper sysResourcesMapper;

    @Override
    public List<SysResources> findAllResourcesByUserId(Integer userId){
        return this.baseMapper.selectResourcesByUserId(userId,true);
    }

    @Override
    public ResponseVo saveResource(SysResources res) {
        Long parentId=res.getParentId();
        if(parentId==null){
            parentId=new Long("0");
        }
        SysResources maxres=this.baseMapper.getMaxTreeIdForParent(parentId);
        String maxTreeId="";
        if(maxres==null){
            SysResources parent=this.baseMapper.selectById(parentId);
            maxTreeId=parent.getTreeId()+"001";
        }else{
            long num=Long.parseLong(maxres.getTreeId())+1;
            maxTreeId=num+"";
        }
        res.setTreeId(maxTreeId);
        int rn=this.baseMapper.insert(res);
        if(rn>0){
            return new ResponseVo(StatusEnum.SUCCESS.getCode());
        }
        return new ResponseVo("失败");
    }

    @Override
    public ResponseVo updateRes(List<SysResources> resList) {
        for(SysResources res:resList){
            this.baseMapper.updateById(res);
        }
        return new ResponseVo(StatusEnum.SUCCESS.getCode());
    }

    @Override
    public List<TreeNode> getTreeData(int roleId) {
        List<SysResources> resources = this.baseMapper.selectList(null);
        List<SysResources> userResources = this.baseMapper.selectResByRoleId(new Long(roleId),false);
        List<TreeNode> treeNodes=new ArrayList<>();
        for(SysResources res:resources){
            TreeNode node=new TreeNode(res.getId()+"",res.getName(),res.getParentId()+"",false);
            if(userResources.contains(res)){
                node.setChecked(true);
            }
            treeNodes.add(node);
        }
        return treeNodes;
    }

    @Override
    public PageVo findAllResForPage(PageVo pageVo) {
        QueryWrapper<SysResources> query= CommonUtil.getQueryWrapperByFilterStr(pageVo.getFilterStr(), SysResources.class);
        query.orderByAsc("tree_id","sort");
        Page<SysResources> page = new Page<>(pageVo.getPageIndex()+1,pageVo.getPageSize());
        IPage<SysResources> datas = this.baseMapper.selectPage(page, query);
        pageVo.setData(datas.getRecords());
        pageVo.setTotal(datas.getTotal());
        return pageVo;
    }

    @Override
    public void batchForbid(List<String> list) {
//        sysResourcesMapper.
        this.baseMapper.batchForbid(list);
    }
}
