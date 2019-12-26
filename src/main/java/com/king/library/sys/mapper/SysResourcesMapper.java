package com.king.library.sys.mapper;

import com.king.library.sys.pojo.SysResources;
import java.util.List;

public interface SysResourcesMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysResources record);

    SysResources selectByPrimaryKey(Long id);

    List<SysResources> selectAll();

    int updateByPrimaryKey(SysResources record);

    List<SysResources> selectResByRoleId(Long id);

    List<SysResources> selectResourcesByUserId(Integer userId);
}