package com.xin.jpush.controller;

import java.util.*;

import cn.jiguang.common.resp.APIConnectionException;
import cn.jiguang.common.resp.APIRequestException;
import cn.jpush.api.JPushClient;
import cn.jpush.api.push.PushResult;
import cn.jpush.api.push.model.Message;
import cn.jpush.api.push.model.Options;
import cn.jpush.api.push.model.Platform;
import cn.jpush.api.push.model.PushPayload;
import cn.jpush.api.push.model.audience.Audience;
import cn.jpush.api.push.model.notification.IosNotification;
import cn.jpush.api.push.model.notification.Notification;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.xin.jpush.entity.JpushEntity;
import com.xin.jpush.service.ExpireService;
import com.xin.jpush.service.JpushService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class JpushController {

    private static Logger logger = LoggerFactory.getLogger(JpushController.class);

    @Autowired
    private JpushService jpushService;
    @Autowired
    private ExpireService expireService;
    /**
     * test properties
     * mstersecret=6835bde8aa5ce87e530bccdc  me:8fa8a3e3762e31a5460643bb
     * appkey=b61859c47d52e438b715f81a       me:39893b41e3c64a6e98a1cf15
     * registerId:1a1018970a9497b153a
     */
    private static final String appkey = "39893b41e3c64a6e98a1cf15";
    private static final String mastersecret = "8fa8a3e3762e31a5460643bb";
    static JPushClient jPushClient = new JPushClient(mastersecret, appkey);


//   此方法用来测试数据库数据
//	@RequestMapping(name = "/databasetest", method = RequestMethod.GET)
//	private Map<String, Object> listJpush() {
//		Map<String, Object> modelJpush = new HashMap<String, Object>();
//		List<JpushEntity> list = new ArrayList<JpushEntity>();
//
//		try {
//			list = jpushService.getJpushEntity();
//			modelJpush.put("rows", list);
//			modelJpush.put("total", list.size());
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//			modelJpush.put("success", false);
//			modelJpush.put("errmsg", e.toString());
//		}
//		return modelJpush;
//	}

    /**
     * ios端
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/jpushtest")//,method = RequestMethod.GET)
    public Map<String, Object> jpushIOS(Long id) {

        Map<String, Object> modelJpush = new HashMap<String, Object>();
        List<JpushEntity> list = new ArrayList<JpushEntity>();
        try {
            list = jpushService.getJpushEntityByid(id);
            modelJpush.put("msg", list);
        } catch (Exception e) {
            System.err.println("errMsg is " + e.getMessage());
        }
        PushPayload pushPayload = PushPayload.newBuilder()
                .setPlatform(Platform.ios())
                .setAudience(Audience.registrationId(""))
                .setNotification(Notification.newBuilder()
                        .addPlatformNotification(IosNotification.newBuilder()
                                .setAlert(modelJpush.get("msg"))
                                .setBadge(+1)
                                .setSound("happy")
                                //  .addExtras(param)
                                .build())
                        .build())
                .setOptions(Options.newBuilder().setApnsProduction(false).build())
                .setMessage(Message.newBuilder().setMsgContent(modelJpush.toString()).build())
                .build();

        try {
            PushResult pushResult = jPushClient.sendPush(pushPayload);
            System.out.println("success");
        } catch (APIConnectionException e) {
            e.printStackTrace();
            System.err.println("errMsg" + e.getMessage());
        } catch (APIRequestException e) {
            e.printStackTrace();
            System.err.println("errMsg" + e.getMessage());
        }
        return modelJpush;
    }


    /**
     * web端
     * 插入操作 我在这里把notification放到sendPush
     * 依据rest修改为put
     */
    @RequestMapping(name = "/addJpush")// ,method = RequestMethod.PUT)
    public void addJpush(JsonObject jsonObject) {

        if (jsonObject == null || jsonObject.isJsonNull()) {
            logger.warn("传参为空");
        } else {
            //入口1  web端传来的公告信息，得到notification并send

            //入口2 车机端传来的消息，验证完直接send 看来是不用了hhh

        }

    }

    /**
     * tag推送地址 POST https://api.jpush.cn/v3/push/validate
     * 这里使用list格式的registerId
     */
    @RequestMapping(value = "/sim/expirepush", method = RequestMethod.PUT)
    public boolean expireMsgPush() {

        Calendar calendar = Calendar.getInstance();
        Date date = new Date();
        calendar.set(Calendar.DATE, 1);
        calendar.roll(Calendar.DATE, -1);

        int currentDays = calendar.get(Calendar.DATE);
        int lastdays;
        if (currentDays == 31) {
            calendar.setTime(date);
            lastdays = 31 - calendar.get(Calendar.DATE);
        } else if (currentDays == 28) {
            lastdays = 28 - calendar.get(Calendar.DATE);
        } else if (currentDays == 29) {
            lastdays = 29 - calendar.get(Calendar.DATE);
        } else {
            lastdays = 30 - calendar.get(Calendar.DATE);
        }

        boolean isPush = false;
        List list = expireService.getSeries();
        String alert = "This is a pushMsg.";

        PushPayload pushPayload = PushPayload.newBuilder()
                .setPlatform(Platform.android_ios())
                .setAudience(Audience.registrationId(list))
                .setNotification(Notification.newBuilder().addPlatformNotification(IosNotification.newBuilder()
                        .setAlert(alert)
                        .setBadge(999)
                        .setSound("happy.caf")
                        .addExtra("from", "Jpush")
                        .build())
                        .build())
                .setMessage(Message.content("您的流量套餐剩余天数为" + lastdays))
                .setOptions(Options.newBuilder()
                        .setApnsProduction(true)
                        .build())
                .build();
        try {
            PushResult pushResult = jPushClient.sendPush(pushPayload);
            System.out.println("success");
            isPush = true;
            return isPush;
        } catch (APIConnectionException e) {
            e.printStackTrace();
            System.err.println("errMsg" + e.getMessage());
        } catch (APIRequestException e) {
            e.printStackTrace();
            System.err.println("errMsg" + e.getMessage());
        }
        return isPush;
    }


    /**
     * 删除消息后还存在于消息列表中
     */

    /**
     * 点击标点
     */

//   //这里面好像可以用fastjson,此函数用于验证消息
//	public JsonObject Valicate(JsonObject cj){
//
//		cj=JSON
//		if () {
//		}
//		}
//        sendPush();
//	}
//
//	/**
//	 * 把notification放到pushPayLoad中并发送
//	 * @return
//	 */
//	PushPayload sendPush(){
//       return PushPayload.newBuilder().build();
//	}
}
