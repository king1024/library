package com.king.library.sys.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.KeySequence;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author duanyong
 * @since 2019-12-27
 */
@KeySequence("kingKeyGenerator")
public class SysRole extends Model<SysRole> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.INPUT)
    private String id;

    /**
     * 角色名
     */
    private String name;

    private String description;

    private Integer available;

    /**
     * 添加时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    @TableField(exist=false)
    private List<SysResources> sysResources;

    public List<SysResources> getSysResources() {
        return sysResources;
    }

    public void setSysResources(List<SysResources> sysResources) {
        this.sysResources = sysResources;
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "SysRole{" +
                "id=" + id +
                ", name=" + name +
                ", description=" + description +
                ", available=" + available +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                "}";
    }
}
