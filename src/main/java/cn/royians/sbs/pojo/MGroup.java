package cn.royians.sbs.pojo;

import java.util.Date;

public class MGroup {
    private Integer gId;

    private String gName;

    private String gAvatarurl;

    private Date gRegesterTime;

    public Integer getgId() {
        return gId;
    }

    public void setgId(Integer gId) {
        this.gId = gId;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName == null ? null : gName.trim();
    }

    public String getgAvatarurl() {
        return gAvatarurl;
    }

    public void setgAvatarurl(String gAvatarurl) {
        this.gAvatarurl = gAvatarurl == null ? null : gAvatarurl.trim();
    }

    public Date getgRegesterTime() {
        return gRegesterTime;
    }

    public void setgRegesterTime(Date gRegesterTime) {
        this.gRegesterTime = gRegesterTime;
    }
}