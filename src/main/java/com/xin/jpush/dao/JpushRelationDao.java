package com.xin.jpush.dao;

import com.xin.jpush.entity.JpushRelationEntity;

import java.util.List;

/**
 * 还没补充宋工中的baseObject类
 */
public interface JpushRelationDao {
    /**
     * 试查询relation中的数据
     *
     * @return
     */
    List<JpushRelationEntity> queryList();
}
