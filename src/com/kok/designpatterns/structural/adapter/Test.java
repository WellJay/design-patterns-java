package com.kok.designpatterns.structural.adapter;

/**
 * @author wenjie
 * @description
 * @time 2019/6/17 0017 10:59
 */
public class Test {

    /**
     *     target 具有了 source的功能
     */
    public static void main(String[] args) {
        Target source = new Adapter();

        source.method1();

        source.method2();
    }

}
