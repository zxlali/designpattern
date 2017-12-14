package templet;

/**
 * Created by Alex on 16/9/18 下午5:44.
 */
public class Coffee extends CaffeineBeverage {
    @Override void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
