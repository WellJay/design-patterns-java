package com.kok.designpatterns.behavioral.observer;

/**
 * @author wenjie
 * @description
 * @time 2019/6/17 0017 17:08
 */
public class Test {

    public static void main(String[] args) {
        Subject sub = new MySubject();
        sub.add(new Observer1());
        sub.add(new Observer2());

        sub.operation();
    }

}
