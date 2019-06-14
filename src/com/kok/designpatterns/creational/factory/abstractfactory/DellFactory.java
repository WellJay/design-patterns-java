package com.kok.designpatterns.creational.factory.abstractfactory;

import com.kok.designpatterns.creational.factory.DellKeyBoard;
import com.kok.designpatterns.creational.factory.DellMouse;
import com.kok.designpatterns.creational.factory.KeyBoard;
import com.kok.designpatterns.creational.factory.Mouse;

/**
 * @author wenjie
 * @description
 * @date 2019/6/13 21:55
 */
public class DellFactory implements PCFactory {
    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }

    @Override
    public KeyBoard createKeyBoard() {
        return new DellKeyBoard();
    }
}
