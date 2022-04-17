package org.example.adapter;

import org.example.interfaces.Duck;
import org.example.interfaces.Turkey;

import java.util.Random;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/4/17
 */
public class DuckAdapter implements Turkey {
    Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        Random rand = new Random();
        if (rand.nextInt(3)  == 0) {
            duck.fly();
        }
    }
}