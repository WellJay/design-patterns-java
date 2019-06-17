package com.kok.designpatterns.behavioral.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * @author wenjie
 * @description
 * @time 2019/6/17 0017 17:10
 */
public class PriceObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof Stock){
            System.out.println("股票价格变化 " + arg);
        }
    }
}
