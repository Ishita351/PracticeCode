package chapter8;

import org.testng.annotations.Test;

public class BeverageTest{
    @Test
    public void testBeverage() {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        System.out.println("\nMaking tea...");
        tea.prepareRecipe();

        System.out.println("\nMaking coffee...");
        coffee.prepareRecipe();
    }
}

