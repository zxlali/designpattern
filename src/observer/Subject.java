package observer;

/**
 * Created by Alex on 16/9/5 下午3:22.
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
