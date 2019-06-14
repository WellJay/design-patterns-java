package com.kok.designpatterns.creational.factory.abstractfactory;

import com.kok.designpatterns.creational.factory.HpKeyBoard;
import com.kok.designpatterns.creational.factory.HpMouse;
import com.kok.designpatterns.creational.factory.KeyBoard;
import com.kok.designpatterns.creational.factory.Mouse;

/**
 * @author wenjie
 * @description
 * @date 2019/6/13 21:55
 */
public class HpFactory implements PCFactory {
    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }

    @Override
    public KeyBoard createKeyBoard() {
        return new HpKeyBoard();
    }
}
