package com.kok.designpatterns.behavioral.strategy;

/**
 * @author wenjie
 * 短信发送接口
 * @description
 * @time 2019/6/14 0014 15:16
 */
public interface SmsStrategy {

    void sendSms(SmsInfoDto smsInfoDto);

}
