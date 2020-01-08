package com.king.library.sys.web;


import com.king.library.common.model.PageVo;
import com.king.library.common.model.ResponseVo;
import com.king.library.common.tools.StringTools;
import com.king.library.sys.pojo.SysCodeSet;
import com.king.library.sys.service.SysCodeSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author duanyong
 * @since 2020-01-07
 */
@Controller
@RequestMapping("/sysCodeSet")
public class SysCodeSetController {

    @Autowired
    private SysCodeSetService sysCodeSetService;

    @ResponseBody
    @RequestMapping("datas")
    public PageVo findAllResForPage(PageVo pageVo){
        pageVo = sysCodeSetService.findAllForPage(pageVo,null);
        return pageVo;
    }

    @ResponseBody
    @RequestMapping("save")
    public ResponseVo save(@RequestBody SysCodeSet set) {
        if(StringTools.isEmpty(set.getSetName())){
            return new ResponseVo("未填写代码类名称");
        }
        set.setSetId(sysCodeSetService.getMaxSetId());
        return sysCodeSetService.saveRecord(set);
    }

    @ResponseBody
    @RequestMapping("batchUpdate")
    public ResponseVo batchUpdate(@RequestBody List<SysCodeSet> setList) {
        return sysCodeSetService.batchUpdate(setList);
    }

    @ResponseBody
    @RequestMapping("update")
    public ResponseVo update(@RequestBody SysCodeSet set) {
        return sysCodeSetService.updateRecord(set);
    }
}

