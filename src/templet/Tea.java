package templet;

/**
 * Created by Alex on 16/9/18 下午5:43.
 */
public class Tea extends CaffeineBeverage {
    @Override void brew() {
        System.out.println("Steeping the tea");
    }

    @Override void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
