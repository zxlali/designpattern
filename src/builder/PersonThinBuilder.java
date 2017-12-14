package builder;

/**
 * Created by Alex on 17/4/12 下午5:24.
 */
public class PersonThinBuilder extends PersonBuilder{
    @Override public void step1() {
        System.out.println("step1");
    }

    @Override public void step2() {
        System.out.println("step2");
    }

    @Override public void step3() {
        System.out.println("step3");
    }
}
