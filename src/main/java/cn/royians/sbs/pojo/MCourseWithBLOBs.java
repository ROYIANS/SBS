package cn.royians.sbs.pojo;

public class MCourseWithBLOBs extends MCourse {
    private String cContent;

    private String cImgUrls;

    public String getcContent() {
        return cContent;
    }

    public void setcContent(String cContent) {
        this.cContent = cContent == null ? null : cContent.trim();
    }

    public String getcImgUrls() {
        return cImgUrls;
    }

    public void setcImgUrls(String cImgUrls) {
        this.cImgUrls = cImgUrls == null ? null : cImgUrls.trim();
    }
}