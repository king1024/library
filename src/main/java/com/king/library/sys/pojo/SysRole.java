package com.king.library.sys.pojo;

import java.util.Date;
import java.util.List;

public class SysRole {
    private Long id;

    private String name;

    private String description;

    private Boolean available;

    private Date createTime;

    private Date updateTime;

    private List<SysResources> sysResources;

    public List<SysResources> getSysResources() {
        return sysResources;
    }

    public void setSysResources(List<SysResources> sysResources) {
        this.sysResources = sysResources;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}