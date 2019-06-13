package com.kok.designpatterns.factory.simplefactory;

import com.kok.designpatterns.factory.Mouse;

public class Test {

    public static void main(String[] args) {

        MouseFactory mouseFactory = new MouseFactory();
        Mouse mouse = mouseFactory.createMouse("HP");

        mouse.sayHi();
    }

}
