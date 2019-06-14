package com.kok.designpatterns.creational.factory.simplefactory;

import com.kok.designpatterns.creational.factory.DellMouse;
import com.kok.designpatterns.creational.factory.HpMouse;
import com.kok.designpatterns.creational.factory.Mouse;

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
