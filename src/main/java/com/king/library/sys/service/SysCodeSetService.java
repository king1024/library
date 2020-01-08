package com.king.library.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.king.library.common.model.PageVo;
import com.king.library.common.model.ResponseVo;
import com.king.library.common.service.BaseService;
import com.king.library.sys.pojo.SysCodeSet;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author duanyong
 * @since 2020-01-07
 */
public interface SysCodeSetService extends BaseService<SysCodeSet> {
    String getMaxSetId();
}
