package com.king.library.sys.service;

import com.king.library.common.service.BaseService;
import com.king.library.sys.pojo.SysCodeItem;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author duanyong
 * @since 2020-01-07
 */
public interface SysCodeItemService extends BaseService<SysCodeItem> {
    String getMaxItemId();
}
