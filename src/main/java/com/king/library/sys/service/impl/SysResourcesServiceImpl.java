package com.king.library.sys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.king.library.common.constants.StatusEnum;
import com.king.library.common.model.ResponseVo;
import com.king.library.common.model.TreeNode;
import com.king.library.sys.mapper.SysResourcesMapper;
import com.king.library.sys.pojo.SysResources;
import com.king.library.sys.service.SysResourcesService;
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


    @Override
    public List<SysResources> findAllResourcesByUserId(Integer userId){
        return this.baseMapper.selectResourcesByUserId(userId);
    }

    @Override
    public ResponseVo saveResource(SysResources res) {
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
    public List<TreeNode> getTreeData(int userId) {
        List<SysResources> resources = this.baseMapper.selectList(null);
        List<SysResources> userResources = this.baseMapper.selectResByRoleId(new Long(userId));
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
}
