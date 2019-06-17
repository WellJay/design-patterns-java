package com.kok.designpatterns.structural.adapter;

/**
 * @author wenjie
 * @description
 * @time 2019/6/17 0017 10:59
 */
public class Adapter extends Source implements Target {
    @Override
    public void method2() {
        System.out.println("method2 from adapter");
    }
}
