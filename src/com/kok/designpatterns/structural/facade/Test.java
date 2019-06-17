package com.kok.designpatterns.structural.facade;

/**
 * @author wenjie
 * @description
 * @time 2019/6/17 0017 14:00
 */
public class Test {

    public static void main(String[] args) {
        Computer computer = new Computer();

        computer.startup();
        computer.shutdown();
    }

}
