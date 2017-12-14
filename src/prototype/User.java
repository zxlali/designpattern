package prototype;

import java.io.*;

/**
 * Created by Alex on 17/4/12 上午11:26.
 */
public class User implements Cloneable, Serializable {
    /**
     * 浅克隆
     * @return
     */
    public User clone() throws  CloneNotSupportedException {
        return (User)super.clone();
    }

    /**
     * 深克隆
     * @return
     */
    public User deepClone() throws IOException, ClassNotFoundException {

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (User) ois.readObject();
    }

    public static void main(String[] args) throws Exception {
        User user = new User(1, "aa");
        Score score = new Score(1, 99);
        user.setScore(score);
        User user1 = user.clone();
        System.out.println(user);
        System.out.println(user1);
        System.out.println(user1.getScore() == user.getScore());
        System.out.println("======");
        User user3 = user.deepClone();
        System.out.println(user3);
        System.out.println(user3.getScore() == user.getScore());

    }

    int id;
    String name;
    Score score;


    public User(){}

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Override public String toString() {
        return "User{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", score=" + score +
            '}';
    }
}
