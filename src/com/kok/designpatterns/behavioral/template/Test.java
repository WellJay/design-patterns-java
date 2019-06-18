package com.kok.designpatterns.behavioral.template;

/**
 * @author wenjie
 * @description
 * @time 2019/6/18 0018 11:10
 */
public class Test {


    public static void main(String[] args) {
        Game game = new WOW();

        game.play();

        game = new LOL();

        game.play();
    }
}
