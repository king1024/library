package com.king.library.sys.mapper;

import com.king.library.sys.pojo.SysRole;
import java.util.List;

public interface SysRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysRole record);

    SysRole selectByPrimaryKey(Long id);

    List<SysRole> selectAll();

    int updateByPrimaryKey(SysRole record);

    List<SysRole> selectRolesByUserId(Integer id);
}