package com.king.library.sys.mapper;

import com.king.library.sys.pojo.SysUser;
import java.util.List;

public interface SysUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysUser record);

    SysUser selectByPrimaryKey(Integer id);

    List<SysUser> selectAll();

    int updateByPrimaryKey(SysUser record);

    List<SysUser> getUserByName(String username);

    List<SysUser> findUser(SysUser sysUser);
}