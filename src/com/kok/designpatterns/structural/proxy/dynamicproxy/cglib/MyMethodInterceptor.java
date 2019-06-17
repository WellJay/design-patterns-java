package com.kok.designpatterns.structural.proxy.dynamicproxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author wenjie
 * @description
 * @time 2019/6/17 0017 11:21
 */
public class MyMethodInterceptor implements MethodInterceptor {
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {

        System.out.println("starting...");

        Object result = methodProxy.invokeSuper(o, args);

        System.out.println("ending...");

        return result;
    }
}
