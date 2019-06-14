package com.kok.designpatterns.creational.factory.abstractfactory;

import com.kok.designpatterns.creational.factory.KeyBoard;
import com.kok.designpatterns.creational.factory.Mouse;

/**
 * @author wenjie
 * @description
 * @date 2019/6/13 21:54
 */
public interface PCFactory {

    Mouse createMouse();

    KeyBoard createKeyBoard();

}
