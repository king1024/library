package com.king.library.sys.mapper;

import com.king.library.sys.pojo.SysResources;
import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author duanyong
 * @since 2019-12-27
 */
public interface SysResourcesMapper extends BaseMapper<SysResources> {

    List<SysResources> selectResByRoleId(Long id,boolean available);

    List<SysResources> selectResourcesByUserId(Integer userId);
}