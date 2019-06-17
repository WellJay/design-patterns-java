package com.kok.designpatterns.structural.proxy.dynamicproxy.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * @author wenjie
 * @description
 * @time 2019/6/17 0017 11:23
 */
public class Test {

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();

        enhancer.setSuperclass(HelloService.class);

        enhancer.setCallback(new MyMethodInterceptor());

        HelloService helloService = (HelloService) enhancer.create();

        helloService.method1();

    }

}
