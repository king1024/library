package com.king.library.sys.web;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.king.library.common.constants.StatusEnum;
import com.king.library.common.model.PageVo;
import com.king.library.common.model.ResponseVo;
import com.king.library.common.model.TreeNode;
import com.king.library.common.tools.StringTools;
import com.king.library.sys.pojo.SysResources;
import com.king.library.sys.service.SysResourcesService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @date: 2019/12/26 20:02
 * @author: duanyong
 * @desc:
 */
@Controller
@RequestMapping("/resources/")
public class ResourcesController {

    @Autowired
    private SysResourcesService sysResourcesService;

    @RequiresPermissions("resource:list")
    @ResponseBody
    @RequestMapping("datas")
    public PageVo findAllResForPage(PageVo pageVo){
        pageVo = sysResourcesService.findAllResForPage(pageVo);
        return pageVo;
    }

    @RequiresPermissions("resource:list")
    @ResponseBody
    @RequestMapping("treeData")
    public List<TreeNode> getTreeData(int roleId){
        List<TreeNode> treeNodes = sysResourcesService.getTreeData(roleId);
        return treeNodes;
    }

    @RequiresPermissions("resource:list")
    @ResponseBody
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
    @ResponseBody
    @RequestMapping("save")
    public ResponseVo save(@RequestBody SysResources res) {
        if(res.getParentId()==null){
            res.setParentId(0L);
        }
        return sysResourcesService.saveResource(res);
    }

    @RequiresPermissions("resource:update")
    @ResponseBody
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
    @ResponseBody
    @RequestMapping("batchForbid")
    @Transactional
    public ResponseVo batchForbid(@RequestBody List<String> resList){
        ResponseVo vo=new ResponseVo(StatusEnum.SUCCESS.getCode());
        sysResourcesService.batchForbid(resList);
        return vo;
    }

    @RequiresPermissions("resource:delete")
    @ResponseBody
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
