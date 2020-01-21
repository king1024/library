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
public class BookContent extends Model<BookContent> {

    private static final long serialVersionUID=1L;

    private String id;

    private String type;

    private String text;

    private String title;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "BookContent{" +
        "id=" + id +
        ", type=" + type +
        ", text=" + text +
        ", title=" + title +
        "}";
    }
}
