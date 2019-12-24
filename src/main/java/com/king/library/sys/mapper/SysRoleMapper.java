package com.king.library.sys.mapper;

import com.king.library.sys.pojo.SysRole;
import java.util.List;

public interface SysRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysRole record);

    SysRole selectByPrimaryKey(Integer id);

    List<SysRole> selectAll();

    int updateByPrimaryKey(SysRole record);

    List<SysRole> findRolesByUser(String userName);
}