package com.kok.designpatterns.factory.abstractfactory;

import com.kok.designpatterns.factory.KeyBoard;
import com.kok.designpatterns.factory.Mouse;

/**
 * @author wenjie
 * @description
 * @date 2019/6/13 21:54
 */
public interface PCFactory {

    Mouse createMouse();

    KeyBoard createKeyBoard();

}
