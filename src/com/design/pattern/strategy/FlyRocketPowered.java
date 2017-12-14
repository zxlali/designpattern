package com.design.pattern.strategy;

/**
 * Created by Alex on 16/9/3 下午3:06.
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override public void fly() {
        System.out.println("I’m flying with a rocket!");
    }
}
