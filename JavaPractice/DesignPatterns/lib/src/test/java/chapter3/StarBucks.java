package chapter3;

import org.testng.annotations.Test;

public class StarBucks {
    @Test
    public void coffeeTest() {
        Beverage beverage1 = new Espresso();
        System.out.println(beverage1.getDescription() + " Rs." + beverage1.cost());

        Beverage beverage2 = new Espresso();
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription() + " Rs." + beverage2.cost());

        Beverage beverage3 = new DarkRoast();
        beverage3 = new Mocha(beverage3);
        System.out.println(beverage3.getDescription() + " Rs." + beverage3.cost());
    }
}

