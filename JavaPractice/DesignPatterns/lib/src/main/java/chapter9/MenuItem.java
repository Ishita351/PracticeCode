package chapter9;

import java.util.Iterator;

//real item like pizza

public class MenuItem extends MenuComponent {
    String name, description;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void print() {
        System.out.print(getName());
        if (isVegetarian()){
            System.out.print("veg");
        }
        System.out.println(price);
        System.out.println(description);
    }

    public Iterator<MenuComponent> createIterator() {
        return new NullIterator();
    }
}
