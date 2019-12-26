package com.king.library.common.model;

import java.util.List;
import java.util.Map;

/**
 * @date: 2019/12/26 19:56
 * @author: duanyong
 * @desc:
 */
public class PageVo {
    /**
     * 参数
     */
    private Map params;
    /**
     * 具体数据
     */
    private List data;
    /**
     * 页码
     */
    private long pageIndex;
    /**
     * 每页多少条
     */
    private long pageSize;
    /**
     * 总共多少条
     */
    private long totalCount;

    public Map getParams() {
        return params;
    }

    public void setParams(Map params) {
        this.params = params;
    }

    public List getData() {
        return data;
    }

    public void setData(List data) {
        this.data = data;
    }

    public long getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(long pageIndex) {
        this.pageIndex = pageIndex;
    }

    public long getPageSize() {
        return pageSize;
    }

    public void setPageSize(long pageSize) {
        this.pageSize = pageSize;
    }

    public long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }
}
