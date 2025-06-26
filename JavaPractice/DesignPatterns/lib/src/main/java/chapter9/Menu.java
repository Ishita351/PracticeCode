package chapter9;

import java.util.*;

// can contain many MenuItems or even other Menus.

public class Menu extends MenuComponent {
    List<MenuComponent> menuComponents = new ArrayList<>();
    String name, description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void print() {
        System.out.print(name + ", " + description);
        for (MenuComponent component : menuComponents) {
            component.print();
        }
    }

    public Iterator<MenuComponent> createIterator() {
        return new CompositeIterator(menuComponents.iterator());
    }
}

