package com.kok.designpatterns.behavioral.template;

/**
 * @author wenjie
 * @description
 * @time 2019/6/18 0018 11:10
 */
public class WOW extends Game {
    @Override
    void init() {
        System.out.println("wow init");
    }

    @Override
    void startGame() {
        System.out.println("wow start");
    }

    @Override
    void endGame() {
        System.out.println("wow end");
    }
}
