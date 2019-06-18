package com.kok.designpatterns.behavioral.template;

/**
 * @author wenjie
 * @description
 * @time 2019/6/18 0018 11:08
 */
public abstract class Game {

    abstract void init();

    abstract void startGame();

    abstract void endGame();

    public void play(){
        init();

        startGame();

        endGame();
    }

}
