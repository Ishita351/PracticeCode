package chapter9;
import java.util.Iterator;

//This is the main user of everything.

public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }

    public void printVegetarianMenu() {
        Iterator<MenuComponent> iterator = allMenus.createIterator();
        System.out.println("VEGETARIAN MENU:");
        while (iterator.hasNext()) {
            MenuComponent component = iterator.next();
            if (component.isVegetarian()) {
                component.print();
            }
        }
    }
}
