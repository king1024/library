package com.king.library.sys.web;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.king.library.common.constants.StatusEnum;
import com.king.library.common.model.PageVo;
import com.king.library.common.model.ResponseVo;
import com.king.library.common.model.TreeNode;
import com.king.library.sys.pojo.SysResources;
import com.king.library.sys.service.SysResourcesService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * @date: 2019/12/26 20:02
 * @author: duanyong
 * @desc:
 */
@RestController
@RequestMapping("/resources/")
public class ResourcesController {

    @Autowired
    private SysResourcesService sysResourcesService;

    @RequiresPermissions("resource:list")
    @RequestMapping("datas")
    public PageVo findAllResForPage(PageVo pageVo){
        pageVo = sysResourcesService.findAllResForPage(pageVo);
        return pageVo;
    }

    @RequiresPermissions("resource:list")
    @RequestMapping("treeData")
    public List<TreeNode> getTreeData(int roleId){
        List<TreeNode> treeNodes = sysResourcesService.getTreeData(roleId);
        return treeNodes;
    }

    @RequiresPermissions("resource:list")
    @RequestMapping("selectData")
    public List<SysResources> selectData(){
        SysResources res=new SysResources();
        res.setAvailable(1);
        QueryWrapper<SysResources> query=new QueryWrapper<SysResources>(res);
        query.orderByDesc("sort");
        List<SysResources> datas = sysResourcesService.list(query);
        return datas;
    }

    @RequiresPermissions("resource:add")
    @RequestMapping("save")
    public ResponseVo save(@RequestBody SysResources res) {
        if(res.getParentId()==null){
            res.setParentId(0L);
        }
        return sysResourcesService.saveResource(res);
    }

    @RequiresPermissions("resource:update")
    @RequestMapping("update")
    public ResponseVo updateRes(@RequestBody List<SysResources> resList){
        return sysResourcesService.updateRes(resList);
    }

    /**
     * 禁用
     * @param resList
     * @return
     */
    @RequiresPermissions("resource:batchForbid")
    @RequestMapping("batchForbid")
    @Transactional
    public ResponseVo batchForbid(@RequestBody List<String> resList){
        ResponseVo vo=new ResponseVo(StatusEnum.SUCCESS.getCode());
        sysResourcesService.batchForbid(resList);
        return vo;
    }

    @RequiresPermissions("resource:delete")
    @RequestMapping("remove")
    @Transactional
    public ResponseVo removeRes(@RequestBody List<String> resList){
        ResponseVo vo=new ResponseVo(StatusEnum.SUCCESS.getCode());
        if(!sysResourcesService.removeByIds(resList)){
            vo.setStatus(StatusEnum.ERROR.getCode());
            vo.setMessage("删除失败");
        }
        return vo;
    }
}
