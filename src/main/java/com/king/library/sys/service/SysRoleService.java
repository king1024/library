package com.king.library.sys.service;

import com.king.library.common.tools.StringTools;
import com.king.library.sys.mapper.SysPermissionMapper;
import com.king.library.sys.mapper.SysRoleMapper;
import com.king.library.sys.pojo.SysPermission;
import com.king.library.sys.pojo.SysRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @date: 2019/12/24 11:35
 * @author: duanyong
 * @desc:
 */
@Service
public class SysRoleService {

    @Autowired
    private SysRoleMapper sysRoleMapper;
    @Autowired
    private SysPermissionMapper sysPermissionMapper;

    public List<SysRole> findRolesByUser(String userName){
        if(StringTools.isEmpty(userName)) {
            return null;
        }
        List<SysRole> roles=sysRoleMapper.findRolesByUser(userName);
        for(SysRole r:roles){
            List<SysPermission> permissions=sysPermissionMapper.findPermissionsByRoleId(r.getId());
            r.setPermissions(permissions);
        }
        return sysRoleMapper.findRolesByUser(userName);
    }

}
