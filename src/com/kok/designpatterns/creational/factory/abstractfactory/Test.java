package com.kok.designpatterns.creational.factory.abstractfactory;

import com.kok.designpatterns.creational.factory.Mouse;

/**
 * @author wenjie
 * @description
 * @date 2019/6/13 21:55
 */
public class Test {

    public static void main(String[] args) {
        PCFactory pcFactory = new DellFactory();

        Mouse mouse = pcFactory.createMouse();

        mouse.sayHi();
    }

}
