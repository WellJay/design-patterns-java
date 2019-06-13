package com.kok.designpatterns.factory.abstractfactory;

import com.kok.designpatterns.factory.DellKeyBoard;
import com.kok.designpatterns.factory.DellMouse;
import com.kok.designpatterns.factory.KeyBoard;
import com.kok.designpatterns.factory.Mouse;

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
