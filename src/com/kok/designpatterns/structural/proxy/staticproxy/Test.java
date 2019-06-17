package com.kok.designpatterns.structural.proxy.staticproxy;

import com.kok.designpatterns.structural.proxy.Sourceable;

/**
 * @author wenjie
 * @description
 * @time 2019/6/17 0017 11:11
 */
public class Test {

    public static void main(String[] args) {
        Sourceable sourceable = new Proxy();
        sourceable.method1();
    }

}
