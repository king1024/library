package com.king.library.sys.service;

import com.king.library.sys.mapper.SysResourcesMapper;
import com.king.library.sys.mapper.SysRoleMapper;
import com.king.library.sys.mapper.SysUserMapper;
import com.king.library.sys.pojo.SysResources;
import com.king.library.sys.pojo.SysRole;
import com.king.library.sys.pojo.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @date: 2019/12/13 17:24
 * @author: duanyong
 * @desc:
 */
@Service
public class SysUserService {
    @Autowired
    private SysUserMapper sysUserMapper;
    @Autowired
    private SysResourcesMapper sysResourcesMapper;
    @Autowired
    private SysRoleMapper sysRoleMapper;

    /**
     * 用户列表
     */
    public List<SysUser> listUser(SysUser sysUser) {
        return sysUserMapper.findUser(sysUser);
    }

    /**
     * 添加用户
     */
    public void addUser(SysUser sysUser) {
        sysUserMapper.insert(sysUser);
    }

    /**
     * 修改用户
     */
    public void updateUser(SysUser sysUser) {
        sysUserMapper.updateByPrimaryKey(sysUser);
    }

    public SysUser getUserByName(String username) {
        SysUser user=null;
       List<SysUser> users = sysUserMapper.getUserByName(username);
       if (users!=null && users.size()==1){
            user=users.get(0);
            List<SysRole> roles=sysRoleMapper.selectRolesByUserId(user.getId());
            for(SysRole role:roles){
                List<SysResources> resources=sysResourcesMapper.selectResByRoleId(role.getId());
                role.setSysResources(resources);
            }
            user.setRoles(roles);
       }
       return user;
    }

}
