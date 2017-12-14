package com.design.pattern.strategy;

/**
 * Created by Alex on 16/9/3 下午2:56.
 */
public class Squack implements QuackBehavior {
    @Override public void quack() {
        System.out.println("SQuack");
    }
}
