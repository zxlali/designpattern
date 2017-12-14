package com.design.pattern.strategy;

/**
 * Created by Alex on 16/9/3 下午2:53.
 */
public class FlyNoWay implements FlyBehavior {
    @Override public void fly() {
        System.out.println("I'm can't fly!");
    }
}
