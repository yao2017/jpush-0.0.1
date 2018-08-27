package com.xin.jpush.service.serviceImpl;

import com.xin.jpush.dao.JpushRelationDao;
import com.xin.jpush.entity.JpushRelationEntity;
import com.xin.jpush.service.JpushRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * NotificationService
 */
@Service
public class JpushRelationServiceImpl implements JpushRelationService {

    @Autowired
    private JpushRelationDao jpushRelationDao;
//    @Autowired
//    private JpushRelationEntity jpushRelationEntity;

    @Override
    public List<JpushRelationEntity> get(Long customerId, Integer status) {

        JpushRelationEntity jpushRelationEntity = new JpushRelationEntity();
        jpushRelationEntity.setCustomerId(customerId);

        if (status != null) {
            jpushRelationEntity.setStatus(status);
        }
        List<JpushRelationEntity> list = this.listByExmple(jpushRelationEntity);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list;
    }

    @Override
    public List<JpushRelationEntity> get(Long customerId) {
        return this.get(customerId, 1);
    }
//
//
//
//    @Override
//    public void register(Long appId, Long customerId, String clientId, Integer clientType) {
//
//        jpushRelationEntity.setAppId(appId);
//        jpushRelationEntity.setCustomerId(customerId);
//        jpushRelationEntity.setClientId(clientId);
//        jpushRelationEntity.setClientType(clientType);
//
//        List<JpushRelationEntity> list= this.listByExmple(jpushRelationEntity);
//
//        if (list == null || list.isEmpty()){
//            jpushRelationEntity.setStatus(1);
//
//        }else {
//            JpushRelationEntity jpushRelationEntity1=list.get(0);
//            jpushRelationEntity1.setStatus(1);
//        }
//
//    }
//
//    @Override
//    public void logout(Long appId, Long customerId, String clientId, Integer clientType) {
//
//        jpushRelationEntity.setAppId(appId);
//        jpushRelationEntity.setCustomerId(customerId);
//        jpushRelationEntity.setClientId(clientId);
//        jpushRelationEntity.setClientType(clientType);
//
//        List<JpushRelationEntity> list= this.listByExmple(jpushRelationEntity);
//
//        if (list == null || list.isEmpty()){
//            jpushRelationEntity.setStatus(0);
//
//        }else {
//            JpushRelationEntity jpushRelationEntity1=list.get(0);
//            jpushRelationEntity1.setStatus(0);
//        }
//
//    }

    /**
     * 实现从关系表中查询值
     *
     * @return
     */
    @Override
    public List<JpushRelationEntity> getlist() {
        return jpushRelationDao.queryList();
    }


    /**
     * 要实现将传进去的参数用list接收
     *
     * @param params
     * @return uncheck
     */
    List<JpushRelationEntity> listByExmple(JpushRelationEntity params) {
        if (params != null) {
            try {
                params.getAppId();
                params.getAppId();
                params.getClientId();
                params.getClientType();
            } catch (Exception e) {
                System.err.println("your addition operation failed and the errMsg is" + e.getMessage());
            }
            List<JpushRelationEntity> list = new ArrayList<JpushRelationEntity>();
            if (list.add(params)) {
                return list;
            } else {
                return listByExmple(params);
            }
        } else {
            System.err.println("Your params is empty!");
        }
        return null;
    }
}
