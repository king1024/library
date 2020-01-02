package com.king.library.common.tools;

import com.king.library.common.model.MenuNode;
import com.king.library.sys.pojo.SysMenu;
import com.king.library.sys.pojo.SysResources;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @date: 2019/12/12 15:26
 * @author: duanyong
 * @desc:
 */
public class MenuTree {
    private List<MenuNode> menuList=new ArrayList<MenuNode>();

    public MenuTree() {
    }

    public List<MenuNode> buildSysMenu(List<SysMenu> sysMenuList){
        for(SysMenu sysMenu : sysMenuList) {
            menuList.add(new MenuNode(sysMenu.getMenuId(),sysMenu.getMenuName(),sysMenu.getIconCls(),
                    sysMenu.getMenuUrl(),"",sysMenu.getParentMenuId()));
        }
        return builTree();
    }

    public List<MenuNode> buildSysMenuByResources(List<SysResources> resourcesList){
        for(SysResources resources : resourcesList) {
            if("menu".equals(resources.getType())){
                menuList.add(new MenuNode(resources.getId().toString(),resources.getName(),resources.getIcon(),
                        resources.getUrl(),"",resources.getParentId().toString()));
            }
        }
        return builTree();
    }

    public List<MenuNode> builTree(){
        List<MenuNode> treeMenus =new  ArrayList<MenuNode>();
        for(MenuNode menuNode : getRootNode()) {
            menuNode=buildChilTree(menuNode);
            treeMenus.add(menuNode);
        }
        return treeMenus;
    }

    //递归，建立子树形结构
    private MenuNode buildChilTree(MenuNode pNode){
        List<MenuNode> chilMenus =new  ArrayList<MenuNode>();
        for(MenuNode menuNode : menuList) {
            if(menuNode.getParentMenuId().equals(pNode.getId())) {
                chilMenus.add(buildChilTree(menuNode));
            }
        }
        if(chilMenus.size()>0){
            pNode.setChildren(chilMenus);
        }
        return pNode;
    }

    //获取根节点
    private List<MenuNode> getRootNode() {
        List<MenuNode> rootMenuLists =new  ArrayList<MenuNode>();
        for(MenuNode menuNode : menuList) {
            if(StringTools.isEmpty(menuNode.getParentMenuId()) || "0".equals(menuNode.getParentMenuId())) {
                rootMenuLists.add(menuNode);
            }
        }
        return rootMenuLists;
    }

    //获取根节点
    public static List<SysMenu> transformToMenu(List<Map> params,String parentId) {
        List<SysMenu> list=new ArrayList<>();
        for(Map map : params) {
            SysMenu menu=new SysMenu();
            menu.setMenuId(StringTools.filterObject(map.get("id")));
            menu.setMenuName(StringTools.filterObject(map.get("text")));
            menu.setMenuUrl(StringTools.filterObject(map.get("url")));
            menu.setIconCls(StringTools.filterObject(map.get("iconCls")));
            menu.setParentMenuId(parentId);
            list.add(menu);
            if(map.get("children")!=null && ((ArrayList)map.get("children")).size()>0){

            }
        }
        return list;
    }
}
