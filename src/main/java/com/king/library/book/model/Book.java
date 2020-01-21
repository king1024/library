package com.king.library.book.model;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author duanyong
 * @since 2020-01-21
 */
public class Book extends Model<Book> {

    private static final long serialVersionUID=1L;

    private String id;

    private String name;

    private String bookCatalogId;

    private String faceImg;

    private String auth;

    private String bookContentId;

    private String bak;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBookCatalogId() {
        return bookCatalogId;
    }

    public void setBookCatalogId(String bookCatalogId) {
        this.bookCatalogId = bookCatalogId;
    }

    public String getFaceImg() {
        return faceImg;
    }

    public void setFaceImg(String faceImg) {
        this.faceImg = faceImg;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public String getBookContentId() {
        return bookContentId;
    }

    public void setBookContentId(String bookContentId) {
        this.bookContentId = bookContentId;
    }

    public String getBak() {
        return bak;
    }

    public void setBak(String bak) {
        this.bak = bak;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Book{" +
        "id=" + id +
        ", name=" + name +
        ", bookCatalogId=" + bookCatalogId +
        ", faceImg=" + faceImg +
        ", auth=" + auth +
        ", bookContentId=" + bookContentId +
        ", bak=" + bak +
        "}";
    }
}
