package com.kok.designpatterns.structural.proxy.staticproxy;

import com.kok.designpatterns.structural.proxy.Source;
import com.kok.designpatterns.structural.proxy.Sourceable;

/**
 * @author wenjie
 * @description
 * @time 2019/6/17 0017 11:09
 */
public class Proxy implements Sourceable {

    private Source source;

    public Proxy() {
        this.source = new Source();
    }

    @Override
    public void method1() {
        before();
        source.method1();
        after();
    }

    private void before() {
        System.out.println("before proxy!");
    }

    private void after() {
        System.out.println("after proxy!");
    }
}
