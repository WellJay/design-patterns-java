package com.kok.designpatterns.factory.simplefactory;

import com.kok.designpatterns.factory.DellMouse;
import com.kok.designpatterns.factory.HpMouse;
import com.kok.designpatterns.factory.Mouse;

public class MouseFactory {
    public Mouse createMouse(String name){
        if("HP".equals(name)){
            return new HpMouse();
        }else if("DELL".equals(name)){
            return new DellMouse();
        }
        return null;
    }
    //静态简单工厂
//    public static Mouse createMouse(String name){
//        if("HP".equals(name)){
//            return new HpMouse();
//        }else if("DELL".equals(name)){
//            return new DellMouse();
//        }
//        return null;
//    }
}
