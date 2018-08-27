package com.xin.jpush.service.serviceImpl;

import com.xin.jpush.entity.VehiclestateEntity;
import com.xin.jpush.service.VehiclestateService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehiclestateServiceImpl implements VehiclestateService {
    //对读取的消息进行标识，所以究竟是怎样的消息可以标记？ 点火熄火的标志什么
    @Override
    public List<VehiclestateEntity> getState() {
        return null;
    }
}
