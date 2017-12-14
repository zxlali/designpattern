package decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by Alex on 16/9/12 下午2:23.
 */
public class InputTest {
    public static void main(String[] args) throws Exception {
        int c;
        InputStream in = new LowerCaseInputStream(
            new BufferedInputStream(
                 new FileInputStream("/Users/zhangxianli/Documents/myspace/designpattern/src/decorator/test.txt")));
        while ((c = in.read()) >= 0) {
            System.out.println((char) c);
        }
        in.close();
    }
}
