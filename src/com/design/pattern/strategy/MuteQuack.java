package com.design.pattern.strategy;

/**
 * Created by Alex on 16/9/3 下午2:55.
 */
public class MuteQuack implements QuackBehavior {
    @Override public void quack() {
        System.out.println("<< Silence >>");
    }
}
