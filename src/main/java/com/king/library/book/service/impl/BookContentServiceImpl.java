package com.king.library.book.service.impl;

import com.king.library.book.service.BookContentService;
import com.king.library.book.model.BookContent;
import com.king.library.book.mapper.BookContentMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author duanyong
 * @since 2020-01-21
 */
@Service
public class BookContentServiceImpl extends ServiceImpl<BookContentMapper, BookContent> implements BookContentService {

}
