package com.king.library.sys.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.king.library.sys.pojo.SysCodeItem;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author duanyong
 * @since 2020-01-07
 */
public interface SysCodeItemMapper extends BaseMapper<SysCodeItem> {

    String getMaxItemId();
}
