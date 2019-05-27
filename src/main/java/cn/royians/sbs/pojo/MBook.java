package cn.royians.sbs.pojo;

import java.util.Date;

public class MBook {
    private Integer bId;

    private Integer bUid;

    private Integer bGid;

    private String bTitle;

    private String bDescription;

    private String bContent;

    private Date bCreateTime;

    private Date bUpdateTime;

    private Boolean bIsDel;

    public Integer getbId() {
        return bId;
    }

    public void setbId(Integer bId) {
        this.bId = bId;
    }

    public Integer getbUid() {
        return bUid;
    }

    public void setbUid(Integer bUid) {
        this.bUid = bUid;
    }

    public Integer getbGid() {
        return bGid;
    }

    public void setbGid(Integer bGid) {
        this.bGid = bGid;
    }

    public String getbTitle() {
        return bTitle;
    }

    public void setbTitle(String bTitle) {
        this.bTitle = bTitle == null ? null : bTitle.trim();
    }

    public String getbDescription() {
        return bDescription;
    }

    public void setbDescription(String bDescription) {
        this.bDescription = bDescription == null ? null : bDescription.trim();
    }

    public String getbContent() {
        return bContent;
    }

    public void setbContent(String bContent) {
        this.bContent = bContent == null ? null : bContent.trim();
    }

    public Date getbCreateTime() {
        return bCreateTime;
    }

    public void setbCreateTime(Date bCreateTime) {
        this.bCreateTime = bCreateTime;
    }

    public Date getbUpdateTime() {
        return bUpdateTime;
    }

    public void setbUpdateTime(Date bUpdateTime) {
        this.bUpdateTime = bUpdateTime;
    }

    public Boolean getbIsDel() {
        return bIsDel;
    }

    public void setbIsDel(Boolean bIsDel) {
        this.bIsDel = bIsDel;
    }
}