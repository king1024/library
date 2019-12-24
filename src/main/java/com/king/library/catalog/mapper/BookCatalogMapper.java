package com.king.library.catalog.mapper;

import com.king.library.catalog.pojo.BookCatalog;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @date: 2019/12/11 16:23
 * @author: duanyong
 * @desc:
 */
//@Mapper
public interface BookCatalogMapper {
    public List<BookCatalog> selectByBo(BookCatalog bookCatalog);
    public BookCatalog selectById(String catalogId);
    public void insertBo(BookCatalog bookCatalog);
    public void updateBo(BookCatalog bookCatalog);
    public void deleteById(String cid);
}
