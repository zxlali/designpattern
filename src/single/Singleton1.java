package single;

/**
 * Created by Alex on 16/9/13 下午4:36.
 */
public class Singleton1 {
    private static Singleton1 instance = new Singleton1();
    private Singleton1() {}

    public static Singleton1 getInstance() {
        return instance;
    }
}
