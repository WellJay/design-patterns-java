package com.kok.designpatterns.creational.factory.factorymethod;

import com.kok.designpatterns.creational.factory.Mouse;

/**
 * @author wenjie
 * @description
 * @date 2019/6/13 21:52
 */
public class Test {

    public static void main(String[] args) {
        MouseFactory mouseFactory = new HpMouseFactory();

        Mouse mouse = mouseFactory.createMouse();

        mouse.sayHi();
    }
}
