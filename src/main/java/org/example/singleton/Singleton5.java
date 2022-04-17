package org.example.singleton;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/4/17
 *
 * 静态内部类方式
 * 对静态域使用延迟初始化，应使用这种方式而不是双检锁方式。这种方式只适用于静态域的情况，双检锁方式可在实例域需要延迟初始化时使用。
 */
public class Singleton5 {

    public Singleton5 (){}

    private static class SingletonHolder {
        private static final Singleton5 INSTANCE = new Singleton5();
    }

    public final static Singleton5 getInstance() {
        return SingletonHolder.INSTANCE;
    }

}
