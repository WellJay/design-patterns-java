package com.kok.designpatterns.structural.decorator;

/**
 * @author wenjie
 * @description
 * @time 2019/6/17 0017 16:06
 */
public class Robot extends Changer {

    public Robot(Transform transform) {
        super(transform);
        System.out.println("become a  robot");
    }

    public void sayHi(){
        System.out.println("say hi");
    }
}
