package org.example.adapter;

import org.example.interfaces.Turkey;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/4/17
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}

