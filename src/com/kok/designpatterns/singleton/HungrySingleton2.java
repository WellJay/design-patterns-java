package com.kok.designpatterns.singleton;

/**
 * 这种方式和上面的方式其实类似，只不过将类实例化的过程放在了静态代码块中，也是在类装载的时候，就执行静态代码块中的代码，初始化类的实例。优缺点和上面是一样的。
 */
public class HungrySingleton2 {

    private static HungrySingleton2 instance;

    static {
        instance = new HungrySingleton2();
    }

    private HungrySingleton2() {}

    public static HungrySingleton2 getInstance() {
        return instance;
    }
}