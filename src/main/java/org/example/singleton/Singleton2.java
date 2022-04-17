package org.example.singleton;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/4/
 *
 * 懒汉式，线程安全
 * 优点： 第一次调用才初始化，避免内存浪费。
 * 缺点： synchronized 加锁会影响效率。
 */
public class Singleton2 {

    private static Singleton2 instance;

    public Singleton2 (){}

    public synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }

}
