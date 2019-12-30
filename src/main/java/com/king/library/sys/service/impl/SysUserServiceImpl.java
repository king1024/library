package com.king.library.sys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.king.library.sys.mapper.SysResourcesMapper;
import com.king.library.sys.mapper.SysRoleMapper;
import com.king.library.sys.mapper.SysUserMapper;
import com.king.library.sys.pojo.SysResources;
import com.king.library.sys.pojo.SysRole;
import com.king.library.sys.pojo.SysUser;
import com.king.library.sys.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author duanyong
 * @since 2019-12-27
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {
    @Autowired
    private SysResourcesMapper sysResourcesMapper;
    @Autowired
    private SysRoleMapper sysRoleMapper;

    @Override
    public SysUser getUserByName(String username) {
        SysUser user=null;
        List<SysUser> users = this.baseMapper.getUserByName(username);
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
