package com.kok.designpatterns.structural.decorator;

/**
 * @author wenjie
 * @description
 * @time 2019/6/17 0017 16:03
 */
public class Car implements Transform {

    public Car(){
        System.out.println("i'am a car");
    }

    public void move() {
        System.out.println("moving...");
    }
}
