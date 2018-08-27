package com.xin.jpush.service;

import java.util.List;

//import com.google.common.cache.Cache;
import com.xin.jpush.dto.JpushExcution;
import com.xin.jpush.entity.JpushEntity;

public interface JpushService {
    //根据apppushid查询
    List<JpushEntity> getJpushEntityByid(Long id);

    //插入数据
    JpushExcution addJpush(JpushEntity jpushEntity);
}
