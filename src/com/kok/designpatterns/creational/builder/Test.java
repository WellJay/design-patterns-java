package com.kok.designpatterns.creational.builder;

/**
 * @author wenjie
 * @description
 * @date 2019/6/14 23:04
 */
public class Test {

    public static void main(String[] args) {
        UserDto userDto = UserDto.builder().userName("kok").passWord("123456").build();
        System.out.println(userDto);
    }

}
