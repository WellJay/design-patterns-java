package com.kok.designpatterns.structural.decorator;

/**
 * @author wenjie
 * @description
 * @time 2019/6/17 0017 16:07
 */
public class Airplane extends Changer {
    public Airplane(Transform transform) {
        super(transform);
        System.out.println("become a airplane");
    }

    public void fly(){
        System.out.println("fly.,,");
    }

}
