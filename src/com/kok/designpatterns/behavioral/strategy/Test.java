package com.kok.designpatterns.behavioral.strategy;

/**
 * @author wenjie
 * @description
 * @time 2019/6/14 0014 15:26
 */
public class Test {

    public static void main(String[] args) {

        SmsInfoDto smsInfoDto = new SmsInfoDto("12345678901", "");

        //用户只需要使用context，不需要关心内部的多态子类使用细节
        Context context = new Context();
        context.sendSms("LOGIN", smsInfoDto);
    }
}
