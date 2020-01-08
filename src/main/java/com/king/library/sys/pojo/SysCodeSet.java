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
public class SysCodeSet extends Model<SysCodeSet> {

    private static final long serialVersionUID=1L;

    private String setId;

    private String setName;

    private String setStatus;

    private String setBak;


    public String getSetId() {
        return setId;
    }

    public void setSetId(String setId) {
        this.setId = setId;
    }

    public String getSetName() {
        return setName;
    }

    public void setSetName(String setName) {
        this.setName = setName;
    }

    public String getSetStatus() {
        return setStatus;
    }

    public void setSetStatus(String setStatus) {
        this.setStatus = setStatus;
    }

    public String getSetBak() {
        return setBak;
    }

    public void setSetBak(String setBak) {
        this.setBak = setBak;
    }

    @Override
    protected Serializable pkVal() {
        return this.setId;
    }

    @Override
    public String toString() {
        return "SysCodeSet{" +
        "setId=" + setId +
        ", setName=" + setName +
        ", setStatus=" + setStatus +
        ", setBak=" + setBak +
        "}";
    }
}
