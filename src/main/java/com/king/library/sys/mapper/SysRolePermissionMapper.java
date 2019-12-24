package com.king.library.sys.mapper;

import com.king.library.sys.pojo.SysRolePermission;
import java.util.List;

public interface SysRolePermissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysRolePermission record);

    SysRolePermission selectByPrimaryKey(Integer id);

    List<SysRolePermission> selectAll();

    int updateByPrimaryKey(SysRolePermission record);
}