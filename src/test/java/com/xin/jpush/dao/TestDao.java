package com.xin.jpush.dao;

import static org.junit.Assert.*;

import java.util.List;

import com.xin.jpush.entity.JpushRelationEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import com.xin.jpush.entity.JpushEntity;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestDao {

    @Autowired
    @SuppressWarnings("SpringJavaAutowiringInspection")
    // private JpushDao jpushDao;
    private JpushRelationDao jpushRelationDao;

    @Test
    public void TestDao() {
        List<JpushRelationEntity> jpushEntity = jpushRelationDao.queryList();//jpushDao.queryListById();
        assertEquals(1, jpushEntity.size());
    }
}
