package com.kok.designpatterns.structural.proxy;

/**
 * @author wenjie
 * @description
 * @time 2019/6/17 0017 11:09
 */
public class Source  implements Sourceable{


    @Override
    public void method1() {
        System.out.println("method1 from source");
    }
}
