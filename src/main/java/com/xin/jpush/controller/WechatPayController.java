package com.xin.jpush.controller;

import com.google.gson.JsonObject;
import com.xin.jpush.service.HistoryRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * 传进支付状态后展现历史列表，具体历史列表中还要怎样去判断
 */
// @RestController
public class WechatPayController {

    //   @Autowired
    //  HistoryRecordService historyRecordService;
    /**
     * 接收微信支付的状态值并判断展示历史纪录
     * @param jb
     * @return
     */
//    @RequestMapping(name = "/view",method = RequestMethod.GET)
//    public boolean reciveStaus(JsonObject jb){
//
//        boolean init=false;
//
//        if ( jb.equals("") || jb==null ){
//            handleException(1);
//        }else if (jb.get("status").equals(1)){
//            //展示历史纪录
//            viewhistoryRecord();
//            return  true;
//
//        }
//       return init;
//    }

    /**
     * 展示历史记录
     */
//     public JsonObject viewhistoryRecord(){
//         //从数据库里获得历史记录的表
//         List<Object> view = historyRecordService.getList();
//         if (view.equals(null) || view== null ){
//             handleException(1);
//         }else {
//             JsonObject jsonObject = new JsonObject();
//             jsonObject.add("list",view);
//             //有什么填什么
//             if(jsonObject.equals(null)){
//                 jsonObject.add("list",view);
//                 return jsonObject;
//             }
//         }
//         return null;
//     }


    /**
     * 异常信息处理（公用）
     */
    // private void handleException(int num){
//        switch (num){
//            case 1:
//                System.err.println("your status is empty!");
//            case 2:
//                System.err.println("your history list is empty");
//                //这里应该有个业务是处理数据表为空的操作，插入一条新的数据或者是？
//        }

    //  }


}
