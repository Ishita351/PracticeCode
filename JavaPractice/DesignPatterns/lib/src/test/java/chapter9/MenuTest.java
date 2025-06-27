package chapter9;

import org.testng.annotations.Test;

public class MenuTest {
    @Test
    public void testSimpleMenu() {
        // Create menus
        MenuComponent mainMenu = new Menu("MAIN MENU", "All meals");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Sweet dishes");

        // Add dessert menu to main menu
        mainMenu.add(dessertMenu);

        // Add items
        mainMenu.add(new MenuItem("Pasta", "Spaghetti with tomato sauce", true, 399));
        dessertMenu.add(new MenuItem("Ice Cream", "Vanilla with chocolate syrup", true, 249));

        // Create and use waitress
        Waitress waitress = new Waitress(mainMenu);
        waitress.printMenu();
        waitress.printVegetarianMenu();
    }
}
