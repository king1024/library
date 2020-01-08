package com.king.library.sys.pojo;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author duanyong
 * @since 2020-01-07
 */
public class SysCodeItem extends Model<SysCodeItem> {

    private static final long serialVersionUID=1L;

    private String itemId;

    private String setId;

    private String superItemId;

    private String itemName;

    private String itemStatus;

    private String itemBak;

    private Integer sort;


    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getSetId() {
        return setId;
    }

    public void setSetId(String setId) {
        this.setId = setId;
    }

    public String getSuperItemId() {
        return superItemId;
    }

    public void setSuperItemId(String superItemId) {
        this.superItemId = superItemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(String itemStatus) {
        this.itemStatus = itemStatus;
    }

    public String getItemBak() {
        return itemBak;
    }

    public void setItemBak(String itemBak) {
        this.itemBak = itemBak;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    protected Serializable pkVal() {
        return this.itemId;
    }

    @Override
    public String toString() {
        return "SysCodeItem{" +
        "itemId=" + itemId +
        ", setId=" + setId +
        ", superItemId=" + superItemId +
        ", itemName=" + itemName +
        ", itemStatus=" + itemStatus +
        ", itemBak=" + itemBak +
        ", sort=" + sort +
        "}";
    }
}
