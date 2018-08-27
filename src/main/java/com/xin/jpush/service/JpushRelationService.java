package com.xin.jpush.service;

import com.xin.jpush.entity.JpushEntity;
import com.xin.jpush.entity.JpushRelationEntity;

import java.util.List;

/**
 * List<JpushEntity> getJpush();
 */

public interface JpushRelationService {


    //查询激活
    List<JpushRelationEntity> get(Long customerId, Integer status);

    List<JpushRelationEntity> get(Long customerId);
//
//    //注册
//    void register(Long appId, Long customerId, String clientId, Integer clientType);
//
//    //登出
//    void logout(Long appId, Long customerId, String clientId, Integer clientType);

    List<JpushRelationEntity> getlist();

}
