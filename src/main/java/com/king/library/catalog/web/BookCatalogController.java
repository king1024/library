package com.king.library.catalog.web;

import com.king.library.catalog.pojo.BookCatalog;
import com.king.library.catalog.service.BookCatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @date: 2019/12/11 16:27
 * @author: duanyong
 * @desc:
 */
@Controller
@RequestMapping("/bookCatalog/")
public class BookCatalogController {

    @Autowired
    private BookCatalogService bookCatalogService;

    @ResponseBody
    @RequestMapping("findBookCatalog")
    public List<BookCatalog> findBookCatalog(BookCatalog bookCatalog){
        return null;
//        return bookCatalogService.selectByBo(bookCatalog);
    }
}
