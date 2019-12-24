package com.king.library.common.model;

import java.util.List;

/**
 * @date: 2019/12/12 15:34
 * @author: duanyong
 * @desc:
 */
public class MenuNode {
    private String id;
    private String text;
    private String iconCls;
    private String url;
    private String state="";
    private String parentMenuId;
    private List<MenuNode> children;

    public MenuNode() {
    }

    public MenuNode(String id, String text, String iconCls, String url, String state, String parentMenuId) {
        this.id = id;
        this.text = text;
        this.iconCls = iconCls;
        this.url = url;
        this.state = state;
        this.parentMenuId = parentMenuId;
    }

    public String getParentMenuId() {
        return parentMenuId;
    }

    public void setParentMenuId(String parentMenuId) {
        this.parentMenuId = parentMenuId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getIconCls() {
        return iconCls;
    }

    public void setIconCls(String iconCls) {
        this.iconCls = iconCls;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<MenuNode> getChildren() {
        return children;
    }

    public void setChildren(List<MenuNode> children) {
        this.children = children;
    }
}
