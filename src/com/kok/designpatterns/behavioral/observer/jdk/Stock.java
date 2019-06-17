package com.kok.designpatterns.behavioral.observer.jdk;


import java.util.Observable;

/**
 * @author wenjie
 * @description
 * @time 2019/6/17 0017 17:11
 */
public class Stock extends Observable {

    private Double price;

    public Stock(Double price){
        this.price = price;
    }

    public void setPrice(Double price){
        this.price = price;
        setChanged();
        this.notifyObservers(price);
    }

    @Override
    public String toString() {
        return "当前股价为：" + price;
    }
}
