package com.king.library.sys.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.king.library.sys.pojo.SysCodeSet;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author duanyong
 * @since 2020-01-07
 */
public interface SysCodeSetMapper extends BaseMapper<SysCodeSet> {

    String getMaxSetId();
}
