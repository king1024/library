package com.king.library.sys.web;

import com.king.library.common.model.MenuNode;
import com.king.library.sys.pojo.SysMenu;
import com.king.library.sys.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @date: 2019/12/12 10:13
 * @author: duanyong
 * @desc:
 */
@Controller
@RequestMapping("/sys/menu/")
public class SysMenuController {

    @Autowired
    private SysMenuService sysMenuService;


    @RequestMapping("list")
    @ResponseBody
    public List<SysMenu> list() {
        List<SysMenu> menu = sysMenuService.findAll();
        return menu;
    }

    @RequestMapping("sidemenu")
    @ResponseBody
    public List<MenuNode> sidemenu() {
        List<MenuNode> menu = sysMenuService.sidemenu();
        return menu;
    }

    @RequestMapping("sidemenu2")
    @ResponseBody
    public List<MenuNode> sidemenu2() {
        List<MenuNode> menu = sysMenuService.sidemenu();
        return menu;
    }

}
