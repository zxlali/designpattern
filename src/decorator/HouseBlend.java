package decorator;

/**
 * Created by Alex on 16/9/12 上午11:41.
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "HouseBlend";
    }
    @Override public Double cost() {
        return 1.41;
    }

}
