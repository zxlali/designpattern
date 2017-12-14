package builder;

/**
 * Created by Alex on 17/4/12 下午5:26.
 */
public class BuilderTest {
    public static void main(String[] args) {
        PersonDirector personDirector = new PersonDirector(new PersonThinBuilder());
        personDirector.createPerson();

    }
}
