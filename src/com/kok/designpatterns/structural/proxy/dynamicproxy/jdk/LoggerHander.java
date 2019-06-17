package com.kok.designpatterns.structural.proxy.dynamicproxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author wenjie
 * @description
 * @time 2019/6/17 0017 11:13
 */
public class LoggerHander implements InvocationHandler {

    private Object target;

    public LoggerHander(Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        startLog();
        Object result = method.invoke(target, args);
        endLog();
        return result;
    }

    private void startLog(){
        System.out.println("start logging...");
    }

    private void endLog(){
        System.out.println("end logging...");
    }
}
