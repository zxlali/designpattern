package decorator;

/**
 * Created by Alex on 16/9/12 上午11:37.
 */
public abstract class Beverage {
    protected static final int TALL = 1;
    protected static final int GRANDE = 2;
    protected static final int VENTI = 3;

    int size = 0;
    String description = "Unknown Beverage";
    public  String getDescription() {
        return description;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public abstract Double cost();

}
