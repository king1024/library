package com.king.library.book.controller;


import com.king.library.book.service.BookService;
import com.king.library.common.model.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author duanyong
 * @since 2020-01-21
 */
@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("datas")
    public PageVo findAllResForPage(PageVo pageVo){
        pageVo = bookService.findAllResForPage(pageVo);
        return pageVo;
    }
}

