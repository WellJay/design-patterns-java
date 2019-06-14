package com.kok.designpatterns.behavioral.strategy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author wenjie
 * @description 短信信息
 * @time 2019/6/14 0014 15:16
 */
@Getter
@Setter
@AllArgsConstructor
public class SmsInfoDto {

    /**
     * 接收电话
     */
    private String phone;

    /**
     * 第三方平台不同短信不同的参数
     */
    private String paramJson;

}
