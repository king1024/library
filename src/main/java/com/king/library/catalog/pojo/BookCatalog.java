package com.king.library.catalog.pojo;

/**
 * @date: 2019/12/11 16:16
 * @author: duanyong
 * @desc:
 */
public class BookCatalog {
    /*
    create table book_catalog(
        catalog_id varchar(64) primary key,
        catalog_name varchar(150) not null,
        areas varchar(10),
        floors varchar(10),
        create_date varchar(10),
        create_user_id VARCHAR(64)
    );
    */
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
    public String toString() {
        return "BookCatalog{" +
                "catalogId='" + catalogId + '\'' +
                ", catalogName='" + catalogName + '\'' +
                ", areas='" + areas + '\'' +
                ", floors='" + floors + '\'' +
                ", createDate='" + createDate + '\'' +
                ", createUserId='" + createUserId + '\'' +
                '}';
    }
}
