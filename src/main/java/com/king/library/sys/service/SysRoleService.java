package com.king.library.sys.service;

import com.king.library.common.tools.StringTools;
import com.king.library.sys.mapper.SysRoleMapper;
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

    public List<SysRole> findRolesByUser(Integer userId){
        return sysRoleMapper.selectRolesByUserId(userId);
    }

    public List<SysRole> findAllRoles(){
        return sysRoleMapper.selectAll();
    }
}
