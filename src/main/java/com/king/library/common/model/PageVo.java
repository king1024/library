package com.king.library.common.model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @date: 2019/12/26 19:56
 * @author: duanyong
 * @desc:
 */
public class PageVo implements Serializable {
    /**
     * 参数
     */
    private Map<String,Object> dataMap;
    /**
     * 具体数据
     */
    private List data;
    /**
     * 页码
     */
    private Long pageIndex;
    /**
     * 每页多少条
     */
    private Long pageSize;
    /**
     * 总共多少条
     */
    private Long total;

    /**
     * 前端过滤字段
     */
    private String filterStr;

    public Map<String, Object> getDataMap() {
        return dataMap;
    }

    public void setDataMap(Map<String, Object> dataMap) {
        this.dataMap = dataMap;
    }

    public List getData() {
        return data;
    }

    public void setData(List data) {
        this.data = data;
    }

    public Long getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Long getPageSize() {
        return pageSize;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public String getFilterStr() {
        return filterStr;
    }

    public void setFilterStr(String filterStr) {
        this.filterStr = filterStr;
    }
}
