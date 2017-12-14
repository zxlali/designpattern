package decorator;

/**
 * Created by Alex on 16/9/12 上午11:40.
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }
    @Override public Double cost() {
        return 1.4;
    }

}
