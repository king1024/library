package com.king.library.book.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.king.library.book.model.Book;
import com.king.library.book.mapper.BookMapper;
import com.king.library.book.service.BookService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.king.library.common.model.PageVo;
import com.king.library.common.tools.CommonUtil;
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
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements BookService {

    @Override
    public PageVo findAllResForPage(PageVo pageVo) {
        QueryWrapper<Book> query= CommonUtil.getQueryWrapperByFilterStr(pageVo.getFilterStr(), Book.class);
        query.orderByAsc("name");
        Page<Book> page = new Page<>(pageVo.getPageIndex()+1,pageVo.getPageSize());
        IPage<Book> datas = this.baseMapper.selectPage(page, query);
        pageVo.setData(datas.getRecords());
        pageVo.setTotal(datas.getTotal());
        return pageVo;
    }
}
