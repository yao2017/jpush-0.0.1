package com.xin.jpush.dao;


import com.xin.jpush.entity.VehiclestateEntity;

import java.util.List;

/**
 * 先查出来
 */
public interface VehiclestateDao {

    List<VehiclestateEntity> queryState();

}
