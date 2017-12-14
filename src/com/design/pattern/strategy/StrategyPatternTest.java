package com.design.pattern.strategy;

/**
 * Created by Alex on 16/9/3 下午2:58.
 */
public class StrategyPatternTest {
    public static void main(String[] args) {
        Duck mallDuck = new MallardDuck();
        mallDuck.performFly();
        mallDuck.setFlyBehavior(new FlyRocketPowered());
        mallDuck.performFly();
        mallDuck.performQuack();
        mallDuck.display();
    }
}
