package com.king.library.common.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.king.library.common.model.PageVo;
import com.king.library.common.model.ResponseVo;
import com.king.library.common.model.SortFild;

import java.util.List;
import java.util.Map;

/**
 * @date: 2020/1/7 19:55
 * @author: duanyong
 * @desc:
 */
public interface BaseService<T> extends IService<T> {
    PageVo findAllForPage(PageVo pageVo, SortFild sortFild);
    ResponseVo saveRecord(T t);
    ResponseVo batchUpdate(List<T> tList);
    ResponseVo updateRecord(T t);
    ResponseVo batchDelete(List tList);
}
