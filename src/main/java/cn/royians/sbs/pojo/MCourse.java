package cn.royians.sbs.pojo;

import java.util.Date;

public class MCourse {
    private Integer cId;

    private Integer cUid;

    private String cVidUrl;

    private Date cCreateTime;

    private Boolean cIsDel;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public Integer getcUid() {
        return cUid;
    }

    public void setcUid(Integer cUid) {
        this.cUid = cUid;
    }

    public String getcVidUrl() {
        return cVidUrl;
    }

    public void setcVidUrl(String cVidUrl) {
        this.cVidUrl = cVidUrl == null ? null : cVidUrl.trim();
    }

    public Date getcCreateTime() {
        return cCreateTime;
    }

    public void setcCreateTime(Date cCreateTime) {
        this.cCreateTime = cCreateTime;
    }

    public Boolean getcIsDel() {
        return cIsDel;
    }

    public void setcIsDel(Boolean cIsDel) {
        this.cIsDel = cIsDel;
    }
}