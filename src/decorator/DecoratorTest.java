package decorator;

/**
 * Created by Alex on 16/9/12 上午11:46.
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() +"$"+ beverage.cost());

        Beverage beverage1 = new HouseBlend();
        beverage1.setSize(1);
        beverage1 = new Soy(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        beverage1 = new CondimentPrettyPrint(beverage1);
        System.out.println(beverage1.getDescription() +" $"+ beverage1.cost());
    }
}
