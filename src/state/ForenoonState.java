package state;

/**
 * Created by Alex on 17/4/13 下午7:47.
 */
public class ForenoonState implements State {
    @Override public void writeProgram(Work work) {
        if (work.getHour() > 12) {
            System.out.println("ForenoonState");
        } else {
            work.setCurrent(new NoonState());
            work.execute();
        }
    }
}
