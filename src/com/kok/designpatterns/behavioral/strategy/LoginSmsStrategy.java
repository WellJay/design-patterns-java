package com.kok.designpatterns.behavioral.strategy;

/**
 * @author wenjie
 * @description
 * @time 2019/6/14 0014 15:18
 */
public class LoginSmsStrategy implements SmsStrategy {

    private String templateCode = "A00001";

    @Override
    public void sendSms(SmsInfoDto smsInfoDto) {
        System.out.println("请求第三方验证码平台发送用户登陆验证短信中...");
        System.out.println("短信模版 = " + templateCode);
        System.out.println("接收手机 = " + smsInfoDto.getPhone());
        System.out.println("动态参数 = " + smsInfoDto.getParamJson());
        System.out.println("验证码发送成功");
    }
}
