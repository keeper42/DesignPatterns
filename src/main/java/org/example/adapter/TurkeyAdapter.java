package org.example.adapter;

import org.example.interfaces.Duck;
import org.example.interfaces.Turkey;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/4/17
 */
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for(int i=0; i < 2; i++) {
            turkey.fly();
        }
    }
}