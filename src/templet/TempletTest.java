package templet;

/**
 * Created by Alex on 16/9/18 下午5:46.
 */
public class TempletTest {
    public static void main(String[] args) {
        Tea tea = new Tea();
        tea.prepareRecipe();

        Coffee coffee = new Coffee();
        coffee.prepareRecipe();
        System.out.println();
    }
}
