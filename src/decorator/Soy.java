package decorator;

/**
 * Created by Alex on 16/9/12 上午11:44.
 */
public class Soy extends CondimentDecorator {
    private Beverage beverage;
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override public Double cost() {
        return beverage.cost() + 0.10;
    }

}
