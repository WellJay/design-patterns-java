package com.kok.designpatterns.factory.factorymethod;

import com.kok.designpatterns.factory.HpMouse;
import com.kok.designpatterns.factory.Mouse;


public class HpMouseFactory implements MouseFactory {
    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }
}
