package com.xin.jpush.dao;

import java.util.List;

import com.xin.jpush.entity.JpushEntity;
import org.springframework.stereotype.Repository;

@Repository
//将dao层的类标识为springbean，同时还能抛出封装为spring的数据访问类型
public interface JpushDao {
    //从id获取list
    List<JpushEntity> queryListById(Long id);

    int insertList(JpushEntity jpushEntity);
}
