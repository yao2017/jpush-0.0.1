package com.xin.jpush.service.serviceImpl;

import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

//import com.google.common.cache.Cache;
//import com.google.common.cache.CacheBuilder;
import com.xin.jpush.dao.JpushDao;
import com.xin.jpush.dto.JpushExcution;
import com.xin.jpush.entity.JpushEntity;
import com.xin.jpush.service.JpushService;
import com.xin.jpush.utils.InfoStateEnum;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Autowired private JpushDao jpushdao;
 * @Override public List<JpushEntity> getJpushEntity() {
 * return jpushdao.queryList();
 * }
 */
@Ignore
@Service
public class JpushServiceImpl implements JpushService {

//	private transient final Logger logger = LoggerFactory.getLogger(JpushServiceImpl.class);

    @Autowired
    private JpushDao jpushDao;

    // private JpushEntity jpushEntity;

    @Override
    public List<JpushEntity> getJpushEntityByid(Long id) {
        return jpushDao.queryListById(id);
    }

    /**
     * 对添加消息进行判断
     *
     * @param jpushEntity
     * @return
     */
    @Override
    @Transactional
    public JpushExcution addJpush(JpushEntity jpushEntity) {
        if (jpushEntity.getAppid() != null) {
            jpushEntity.setCreated(new Date());
            jpushEntity.setUpdated(new Date());
            try {
                int EffectedNum = jpushDao.insertList(jpushEntity);
                if (EffectedNum > 1) {
                    return new JpushExcution(InfoStateEnum.OPERATIONSUCCESS, jpushEntity);
                } else {
                    return new JpushExcution(InfoStateEnum.OPERATIONFAILED);
                }
            } catch (Exception e) {
                throw new RuntimeException("添加信息失败" + e.toString());
            }
        } else {
            return new JpushExcution(InfoStateEnum.EMPTY);
        }

    }


    /**
     * 设置缓存的参数
     *
     * @return
     */
//     private static Cache<Long,JpushEntity> cache=CacheBuilder.newBuilder().maximumSize(100)
//			.expireAfterWrite(3,TimeUnit.HOURS).build();

    /**
     * 用缓存优化读取速度
     * 因为框架的差异性，对于缓存的优化完全可以不做，自己的这块数据量小且盖起来太繁琐
     */
//     public JpushEntity get(final Long id){
//     	JpushEntity jpushEntity=null;
//
//		 jpushEntity = cache.get(id, new Callable<JpushEntity>() {
//			 @Override
//			 public JpushEntity call() throws Exception {
//				 logger.info(String.format("加载推送应用[appPushId=%s]到localcache", id));
//				 return get(id);
//			 }
//		 })
//
//		 return null;
//	 }
}

