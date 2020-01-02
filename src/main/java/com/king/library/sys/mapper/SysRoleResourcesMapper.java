package com.king.library.sys.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.king.library.sys.pojo.SysRoleResources;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author duanyong
 * @since 2019-12-27
 */
public interface SysRoleResourcesMapper extends BaseMapper<SysRoleResources> {
    void batchInsert(@Param("roleResources") List<SysRoleResources> roleResources);
}