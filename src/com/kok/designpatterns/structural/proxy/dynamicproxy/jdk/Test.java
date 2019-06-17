package com.kok.designpatterns.structural.proxy.dynamicproxy.jdk;

import com.kok.designpatterns.structural.proxy.Source;
import com.kok.designpatterns.structural.proxy.Sourceable;

import java.lang.reflect.Proxy;

/**
 * @author wenjie
 * @description
 * @time 2019/6/17 0017 11:16
 */
public class Test {

    public static void main(String[] args) {
        Source source = new Source();
        LoggerHander loggerHander = new LoggerHander(source);

        Sourceable sourceable = (Sourceable) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), source.getClass().getInterfaces(), loggerHander);

        sourceable.method1();
    }

}
