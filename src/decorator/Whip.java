package decorator;

/**
 * Created by Alex on 16/9/12 上午11:45.
 */
public class Whip extends CondimentDecorator {
    private Beverage beverage;
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override public Double cost() {
        return beverage.cost() + 0.30;
    }

}
