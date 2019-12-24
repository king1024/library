package com.king.library.sys.service;

import com.king.library.sys.mapper.SysPermissionMapper;
import com.king.library.sys.pojo.SysPermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

/**
 * @date: 2019/12/13 17:27
 * @author: duanyong
 * @desc:
 */
@Service
public class SysPermissionService {

    @Autowired
    private SysPermissionMapper sysPermissionMapper;

    /**
     * 查询某用户的 角色  菜单列表   权限列表
     */
//    public List<SysPermission> getUserPermission(String username) {
//        List<SysPermission> userPermissions = getUserPermissionFromDB(username);
//        return userPermissions;
//    }

    /**
     * 从数据库查询用户权限信息
     */
//    private List<SysPermission> getUserPermissionFromDB(String username) {
//        List<SysPermission> userPermission = sysPermissionMapper.getUserPermission(username);
//        //管理员角色ID为1
//        int adminRoleId = 1;
//        //如果是管理员
//        String roleIdKey = "roleId";
//        if (adminRoleId == userPermission.getIntValue(roleIdKey)) {
//            //查询所有菜单  所有权限
//            Set<String> menuList = permissionMapper.getAllMenu();
//            Set<String> permissionList = sysPermissionMapper.getAllPermission();
//            userPermission.put("menuList", menuList);
//            userPermission.put("permissionList", permissionList);
//        }
//        return userPermission;
//    }
}
