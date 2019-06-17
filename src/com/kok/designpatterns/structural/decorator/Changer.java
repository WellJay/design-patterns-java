package com.kok.designpatterns.structural.decorator;

/**
 * @author wenjie
 * @description 抽象装饰类
 * @time 2019/6/17 0017 16:05
 */
public class Changer implements Transform{

    private Transform transform;

    public Changer(Transform transform){
        this.transform = transform;
    }

    public void move() {
        transform.move();
    }
}
