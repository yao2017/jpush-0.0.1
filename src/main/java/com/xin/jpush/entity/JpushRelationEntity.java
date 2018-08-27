package com.xin.jpush.entity;

import java.util.List;

/**
 * push—client—customer表中字段
 */
public class JpushRelationEntity {

    private Long customerId;

    private Long appId;

    private String clientId;

    private Integer clientType;

    private Integer status;

    /**
     * getter and setter
     *
     * @return
     */

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public Integer getClientType() {
        return clientType;
    }

    public void setClientType(Integer clientType) {
        this.clientType = clientType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
    /**
     * 待补充hash算法
     */
//    public  List<JpushRelationEntity> listByExmple(){
//        return List
//    }
}
