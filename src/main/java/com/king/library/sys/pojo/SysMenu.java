package com.king.library.sys.pojo;

import java.util.ArrayList;
import java.util.List;

/**
 * @date: 2019/12/12 10:02
 * @author: duanyong
 * @desc:
 */
public class SysMenu {

    private String menuId;

    private String menuName;

    private String menuUrl;

    private String parentMenuId;

    private String iconCls;

    public String getIconCls() {
        return iconCls;
    }

    public void setIconCls(String iconCls) {
        this.iconCls = iconCls;
    }

    private List<SysMenu> children = new ArrayList<SysMenu>();

    public void addChild(SysMenu menu) {
        if (! this.children.contains(menu)) {
            this.children.add(menu);
        }
    }

    public boolean isLeaf() {
        return this.children.isEmpty();
    }

    public List<SysMenu> getChildren() {
        return children;
    }

    public void setChildren(List<SysMenu> children) {
        this.children = children;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public String getParentMenuId() {
        return parentMenuId;
    }

    public void setParentMenuId(String parentMenuId) {
        this.parentMenuId = parentMenuId;
    }

}

