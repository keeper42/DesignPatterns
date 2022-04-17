package org.example.singleton;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/4/17
 *
 * 饿汉式
 * 优点：没有锁，执行效率会提高。
 * 缺点：类加载时就初始化，浪费内存。
 * 它基于 classloader 机制避免了多线程的同步问题，单例对象在类装载时就实例化了。
 */
public class Singleton3 {

    private static Singleton3 instance = new Singleton3 ();

    public Singleton3() {}

    public Singleton3 getInstance() {
        return instance;
    }

}