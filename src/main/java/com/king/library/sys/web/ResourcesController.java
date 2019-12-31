package com.king.library.sys.web;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.king.library.common.model.PageVo;
import com.king.library.common.model.ResponseVo;
import com.king.library.common.model.TreeNode;
import com.king.library.common.tools.StringTools;
import com.king.library.sys.pojo.SysResources;
import com.king.library.sys.service.SysResourcesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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

    @ResponseBody
    @RequestMapping("datas")
    public PageVo findAllRes(PageVo pageVo){
        SysResources resources=null;
        if(StringTools.isNotEmpty(pageVo.getFilterStr())){
            resources = JSON.parseObject(pageVo.getFilterStr(), SysResources.class);
        }

        QueryWrapper<SysResources> query=new QueryWrapper<SysResources>(resources);
        List<SysResources> allResources = sysResourcesService.list(query);
        pageVo.setData(allResources);
        pageVo.setTotalCount(allResources.size());
        return pageVo;
    }

    @ResponseBody
    @RequestMapping("treeData")
    public List<TreeNode> getTreeData(int userId){
        List<TreeNode> treeNodes = sysResourcesService.getTreeData(userId);
        return treeNodes;
    }

    @ResponseBody
    @RequestMapping("save")
    public ResponseVo updateResource(SysResources res){
        return sysResourcesService.saveResource(res);
    }

    @ResponseBody
    @RequestMapping("update")
    public ResponseVo updateRes(@RequestBody List<SysResources> resList){
        return sysResourcesService.updateRes(resList);
    }
}
