package org.example.adapter;

import org.example.interfaces.Duck;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/4/17
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying as a duck");
    }
}
