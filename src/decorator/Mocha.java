package decorator;

/**
 * Created by Alex on 16/9/12 上午11:42.
 */
public class Mocha extends CondimentDecorator {
    private Beverage beverage;
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override public Double cost() {
        double cost = beverage.cost() + 0.20;
        switch (beverage.getSize()) {
            case 1:
                return cost + 0.1;
            case 2:
                return cost + 0.2;
            case 3:
                return cost + 0.3;
        }
        return cost;
    }
}
