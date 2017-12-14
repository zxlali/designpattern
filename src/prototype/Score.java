package prototype;

import java.io.Serializable;

/**
 * Created by Alex on 17/4/12 上午11:47.
 */
public class Score implements Serializable {
    int id;
    int score;

    public Score(int score, int id) {
        this.score = score;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override public String toString() {
        return "Score{" +
            "id=" + id +
            ", score=" + score +
            '}';
    }
}
