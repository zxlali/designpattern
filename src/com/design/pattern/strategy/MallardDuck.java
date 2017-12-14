package com.design.pattern.strategy;

/**
 * Created by Alex on 16/9/3 下午3:00.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
//        flyBehavior = new FlyWithWings();
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    @Override public void display() {
        System.out.println("I’m a real Mallard duck");
    }
}
