package com.xin.jpush.service.serviceImpl;

import com.xin.jpush.service.ExpireService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExpireServiceImpl implements ExpireService {
    @Override
    public List getSeries() {
        List list = new ArrayList();
        list.add(1, "registerId1");
        list.add(2, "registerId2");
        list.add(3, "registerId2");
        return list;
    }
}
