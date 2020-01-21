package com.king.library.book.service;

import com.king.library.common.model.PageVo;
import com.king.library.book.model.Book;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author duanyong
 * @since 2020-01-21
 */
public interface BookService extends IService<Book> {

    PageVo findAllResForPage(PageVo pageVo);
}
