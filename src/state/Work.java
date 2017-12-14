package state;

/**
 * Created by Alex on 17/4/13 下午7:46.
 */
public class Work {
    private State current;
    private int hour;

    public Work(State current) {
        this.current = new ForenoonState();
    }


    public State getCurrent() {
        return current;
    }

    public void setCurrent(State current) {
        this.current = current;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void execute () {
        current.writeProgram(this);
    }
}
