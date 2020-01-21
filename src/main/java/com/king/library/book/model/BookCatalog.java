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
public class BookCatalog extends Model<BookCatalog> {

    private static final long serialVersionUID=1L;

    private String catalogId;

    private String catalogName;

    private String areas;

    private String floors;

    private String createDate;

    private String createUserId;


    public String getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public String getAreas() {
        return areas;
    }

    public void setAreas(String areas) {
        this.areas = areas;
    }

    public String getFloors() {
        return floors;
    }

    public void setFloors(String floors) {
        this.floors = floors;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    @Override
    protected Serializable pkVal() {
        return this.catalogId;
    }

    @Override
    public String toString() {
        return "BookCatalog{" +
        "catalogId=" + catalogId +
        ", catalogName=" + catalogName +
        ", areas=" + areas +
        ", floors=" + floors +
        ", createDate=" + createDate +
        ", createUserId=" + createUserId +
        "}";
    }
}
