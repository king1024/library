package com.king.library.sys.service;

import com.king.library.common.model.MenuNode;
import com.king.library.common.tools.MenuTree;
import com.king.library.sys.mapper.SysMenuMapper;
import com.king.library.sys.pojo.SysMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @date: 2019/12/12 10:13
 * @author: duanyong
 * @desc:
 */
@Service
public class SysMenuService {

    @Autowired
    private SysMenuMapper sysMenuMapper;


    public List<SysMenu> findAll() {
        return sysMenuMapper.findAll();
    }

    public List<MenuNode> sidemenu() {
        List<SysMenu> list = sysMenuMapper.findAll();
        MenuTree tree=new MenuTree();
        List<MenuNode> list2 =tree.buildSysMenu(list);
        return list2;
    }

    public void inserBatchByMap(List<Map> params) {
        List<SysMenu> list=new ArrayList<>();
        sysMenuMapper.inserBatch(list);
    }

}
