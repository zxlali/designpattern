package adapter;

/**
 * Created by Alex on 16/9/14 下午12:03.
 */
public interface Iterator {
    boolean hasNext();
    Object next();
    void remove();
}
