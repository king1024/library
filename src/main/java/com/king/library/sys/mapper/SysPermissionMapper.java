package com.king.library.sys.mapper;

import com.king.library.sys.pojo.SysPermission;
import java.util.List;

public interface SysPermissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysPermission record);

    SysPermission selectByPrimaryKey(Integer id);

    List<SysPermission> selectAll();

    int updateByPrimaryKey(SysPermission record);

    List<SysPermission> findPermissionsByRoleId(Integer id);
}