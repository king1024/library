package com.king.library.sys.service;

import com.king.library.sys.mapper.SysUserMapper;
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

    /**
     * 用户列表
     */
    public List<SysUser> listUser(SysUser sysUser) {
        return sysUserMapper.selectUser(sysUser);
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
}
