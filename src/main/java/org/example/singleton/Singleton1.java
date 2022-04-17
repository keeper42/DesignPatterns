package org.example.singleton;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/4/17
 *
 * 懒汉式，懒加载，线程不安全
 */
public class Singleton1 {

    private static Singleton1 instance;

    public Singleton1(){}

    public Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }

}
