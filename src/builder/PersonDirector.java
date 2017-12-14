package builder;

/**
 * Created by Alex on 17/4/12 下午5:25.
 */
public class PersonDirector {
    private PersonBuilder pb;

    public PersonDirector(PersonBuilder pb) {
        this.pb = pb;
    }

    public void createPerson(){
        pb.step1();
        pb.step2();
        pb.step3();
    }
}
