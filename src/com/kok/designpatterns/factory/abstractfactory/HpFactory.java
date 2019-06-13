package com.kok.designpatterns.factory.abstractfactory;

import com.kok.designpatterns.factory.HpKeyBoard;
import com.kok.designpatterns.factory.HpMouse;
import com.kok.designpatterns.factory.KeyBoard;
import com.kok.designpatterns.factory.Mouse;

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
