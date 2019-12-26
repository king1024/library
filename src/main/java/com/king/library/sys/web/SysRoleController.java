package com.king.library.sys.web;

import com.king.library.sys.pojo.SysRole;
import com.king.library.sys.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @date: 2019/12/26 16:45
 * @author: duanyong
 * @desc:
 */
@Controller
@RequestMapping("/sysRole/")
public class SysRoleController {

    @Autowired
    private SysRoleService sysRoleService;

    @ResponseBody
    @RequestMapping("datas")
    public List<SysRole> findAllRoles(){
        return sysRoleService.findAllRoles();
    }
}
