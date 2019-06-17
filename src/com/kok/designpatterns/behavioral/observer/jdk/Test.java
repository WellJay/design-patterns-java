package com.kok.designpatterns.behavioral.observer.jdk;

/**
 * @author wenjie
 * @description
 * @time 2019/6/17 0017 17:14
 */
public class Test {

    public static void main(String[] args) {
        Stock stock = new Stock(10d);

        stock.addObserver(new PriceObserver());

        System.out.println(stock.toString());

        stock.setPrice(11d);
    }

}
