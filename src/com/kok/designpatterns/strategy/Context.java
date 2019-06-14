package com.kok.designpatterns.strategy;

/**
 * @author wenjie
 * @description
 * @time 2019/6/14 0014 15:35
 */
public class Context {

    private SmsStrategy strategy;

    /**
     * 通常在spring中是直接使用@Autowired一个map的形式将策略模式的key和对象自动装配，直接使用 strategy = map.get("channel");
     * @param channel
     * @param smsInfoDto
     */
    public void sendSms(String channel, SmsInfoDto smsInfoDto){
        if("LOGIN".equals(channel)){
            strategy = new LoginSmsStrategy();
        }else if("REG".equals(channel)){
            strategy = new RegSmsStrategy();
        }
        strategy.sendSms(smsInfoDto);
    }

}
