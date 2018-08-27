package com.xin.jpush;

//import cn.jiguang.common.resp.APIConnectionException;
//import cn.jiguang.common.resp.APIRequestException;
//import cn.jpush.api.JPushClient;
//import cn.jpush.api.push.PushResult;
//import cn.jpush.api.push.model.Message;
//import cn.jpush.api.push.model.Options;
//import cn.jpush.api.push.model.Platform;
//import cn.jpush.api.push.model.PushPayload;
//import cn.jpush.api.push.model.audience.Audience;
//import cn.jpush.api.push.model.notification.IosNotification;
//import cn.jpush.api.push.model.notification.Notification;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Ignore
@RestController
public class jpush {
    //一会看一下传参的类型
    /**
     * appkey,masetsecret
     */
    private static final String appkey = "b61859c47d52e438b715f81a";
    private static final String mastersecret = "6835bde8aa5ce87e530bccdc";
//    static  JPushClient jPushClient=new JPushClient(mastersecret,appkey);


//Map<String,String>param
//    public  void jpushAndriod() throws APIConnectionException, APIRequestException {
//
//        PushPayload pushPayload=PushPayload.newBuilder()
//                .setPlatform(Platform.android())
//                .setAudience(Audience.registrationId("1a1018970a9497b153a"))
//                .setNotification(Notification.alert("this is Alert"))
//                .setOptions(Options.newBuilder().setApnsProduction(false).build())
//                .setMessage(Message.content("this is MsgContent"))
//                .build();
//
//
//
//        PushResult pushResult=jPushClient.sendPush(pushPayload);
//
//    }

//registerId:1a1018970a9497b153a 测试手机端的APP
//    @RequestMapping(value = "/jpushtest",method = RequestMethod.GET)
//    public void jpushIOS(){
//            PushPayload pushPayload=PushPayload.newBuilder()
//                    .setPlatform(Platform.ios())
//                    .setAudience(Audience.registrationId(""))
//                    .setNotification(Notification.newBuilder()
//                            .addPlatformNotification(IosNotification.newBuilder()
//                                  .setAlert("this is Alert")
//                                    .setBadge(+1)
//                                    .setSound("happy")
//                                  //  .addExtras(param)
//                                    .build())
//                            .build())
//                    .setOptions(Options.newBuilder().setApnsProduction(false).build())
//                    .setMessage(Message.newBuilder().setMsgContent("this is MsgContent").build())
//                    .build();
//
//        try {
//            PushResult pushResult=jPushClient.sendPush(pushPayload);
//            System.out.println("success");
//        } catch (APIConnectionException e) {
//            e.printStackTrace();
//            System.err.println("errMsg"+e.getMessage());
//        } catch (APIRequestException e) {
//            e.printStackTrace();
//            System.err.println("errMsg"+e.getMessage());
//        }
//    }
}
