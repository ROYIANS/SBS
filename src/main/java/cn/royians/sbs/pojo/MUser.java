package cn.royians.sbs.pojo;

import java.util.Date;

public class MUser {
    private Integer uId;

    private Integer uOpenid;

    private Integer uGid;

    private String uSessionKey;

    private String u3rdKey;

    private String uNickname;

    private String uAvatarUrl;

    private String uCity;

    private String uLanguage;

    private Date uRegesterTime;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getuOpenid() {
        return uOpenid;
    }

    public void setuOpenid(Integer uOpenid) {
        this.uOpenid = uOpenid;
    }

    public Integer getuGid() {
        return uGid;
    }

    public void setuGid(Integer uGid) {
        this.uGid = uGid;
    }

    public String getuSessionKey() {
        return uSessionKey;
    }

    public void setuSessionKey(String uSessionKey) {
        this.uSessionKey = uSessionKey == null ? null : uSessionKey.trim();
    }

    public String getU3rdKey() {
        return u3rdKey;
    }

    public void setU3rdKey(String u3rdKey) {
        this.u3rdKey = u3rdKey == null ? null : u3rdKey.trim();
    }

    public String getuNickname() {
        return uNickname;
    }

    public void setuNickname(String uNickname) {
        this.uNickname = uNickname == null ? null : uNickname.trim();
    }

    public String getuAvatarUrl() {
        return uAvatarUrl;
    }

    public void setuAvatarUrl(String uAvatarUrl) {
        this.uAvatarUrl = uAvatarUrl == null ? null : uAvatarUrl.trim();
    }

    public String getuCity() {
        return uCity;
    }

    public void setuCity(String uCity) {
        this.uCity = uCity == null ? null : uCity.trim();
    }

    public String getuLanguage() {
        return uLanguage;
    }

    public void setuLanguage(String uLanguage) {
        this.uLanguage = uLanguage == null ? null : uLanguage.trim();
    }

    public Date getuRegesterTime() {
        return uRegesterTime;
    }

    public void setuRegesterTime(Date uRegesterTime) {
        this.uRegesterTime = uRegesterTime;
    }
}