package com.kok.designpatterns.behavioral.template;

/**
 * @author wenjie
 * @description
 * @time 2019/6/18 0018 11:09
 */
public class LOL extends Game {

    @Override
    void init() {
        System.out.println("init lol");
    }

    @Override
    void startGame() {
        System.out.println("lol start");
    }

    @Override
    void endGame() {
        System.out.println("lol end");
    }
}
