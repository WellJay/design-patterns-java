package com.kok.designpatterns.creational.factory.factorymethod;

import com.kok.designpatterns.creational.factory.HpMouse;
import com.kok.designpatterns.creational.factory.Mouse;


public class HpMouseFactory implements MouseFactory {
    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }
}
