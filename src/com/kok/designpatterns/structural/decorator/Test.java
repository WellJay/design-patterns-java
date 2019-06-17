package com.kok.designpatterns.structural.decorator;

/**
 * @author wenjie
 * @description
 * @time 2019/6/17 0017 16:07
 */
public class Test {

    public static void main(String[] args) {
        Transform transform = new Car();
        transform.move();

        Robot robot = new Robot(transform);
        robot.sayHi();
        robot.move();
    }

}
