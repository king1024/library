package com.king.library.sys.mapper;

import com.king.library.sys.pojo.SysResources;
import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

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

    List<SysResources> selectResourcesByUserId(@Param("userId") Integer userId,@Param("available") boolean available);
    /**
     * 禁用
     * @param resList
     */
    void batchForbid(List<String> resList);
}