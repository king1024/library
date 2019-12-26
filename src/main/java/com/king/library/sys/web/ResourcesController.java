package com.king.library.sys.web;

import com.king.library.common.model.PageVo;
import com.king.library.sys.pojo.SysResources;
import com.king.library.sys.service.SysResourcesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
        List<SysResources> allResources = sysResourcesService.findAllResources();
        pageVo.setData(allResources);
        return pageVo;
    }
}
