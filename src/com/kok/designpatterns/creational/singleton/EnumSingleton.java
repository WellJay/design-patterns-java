package com.kok.designpatterns.creational.singleton;

/**
 * 借助JDK1.5中添加的枚举来实现单例模式。不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象。
 *
 * EnumSingleton.INSTANCE.whateverMethod();
 */
public enum EnumSingleton {
    INSTANCE;
    public void whateverMethod() {
        System.out.println(1);
    }
}