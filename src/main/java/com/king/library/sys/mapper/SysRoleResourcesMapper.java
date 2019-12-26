package com.king.library.sys.mapper;

import com.king.library.sys.pojo.SysRoleResources;
import java.util.List;

public interface SysRoleResourcesMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysRoleResources record);

    SysRoleResources selectByPrimaryKey(Long id);

    List<SysRoleResources> selectAll();

    int updateByPrimaryKey(SysRoleResources record);
}