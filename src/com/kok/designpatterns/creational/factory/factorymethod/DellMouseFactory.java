package com.kok.designpatterns.creational.factory.factorymethod;

import com.kok.designpatterns.creational.factory.DellMouse;
import com.kok.designpatterns.creational.factory.Mouse;

/**
 * @author wenjie
 * @description
 * @date 2019/6/13 21:52
 */
public class DellMouseFactory implements MouseFactory {
    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }
}
