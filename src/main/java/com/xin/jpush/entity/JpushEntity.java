package com.xin.jpush.entity;

import java.util.Date;

/**
 * @author 84583
 * test 数据库app_push表
 * private int apppushid;
 * private int appid;
 * private String appkey;
 * private String masterSecret;
 * private String pushurl;
 * private String description;
 * private Date created;
 * private Date updated;
 */
public class JpushEntity {
    private Long apppushid;
    private Long appid;
    private String appkey;
    private String masterSecret;
    private String pushurl;
    private String description;
    private Date created;
    private Date updated;

    public Long getApppushid() {
        return apppushid;
    }

    public void setApppushid(Long apppushid) {
        this.apppushid = apppushid;
    }

    public Long getAppid() {
        return appid;
    }

    public void setAppid(Long appid) {
        this.appid = appid;
    }

    public String getAppkey() {
        return appkey;
    }

    public void setAppkey(String appkey) {
        this.appkey = appkey;
    }

    public String getMasterSecret() {
        return masterSecret;
    }

    public void setMasterSecret(String masterSecret) {
        this.masterSecret = masterSecret;
    }

    public String getPushurl() {
        return pushurl;
    }

    public void setPushurl(String pushurl) {
        this.pushurl = pushurl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

}
