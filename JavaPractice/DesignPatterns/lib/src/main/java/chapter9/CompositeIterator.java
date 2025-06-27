package chapter9;
import java.util.*;

//Allows us to walk through the whole menu structure, including nested menus
//ITERATOR - Access elements of a collection one at a time,Without exposing how the collection is structured internally

public class CompositeIterator implements Iterator<MenuComponent> {
    Stack<Iterator<MenuComponent>> stack = new Stack<>(); // A stack of iterators
    //When it finds a Menu, it pushes its children’s iterator onto the stack

    public CompositeIterator(Iterator<MenuComponent> iterator) {
        this.stack.push(iterator);
    }

    public MenuComponent next() {
        if (hasNext()) {
            Iterator<MenuComponent> iterator = stack.peek();
            MenuComponent component = iterator.next();
            stack.push(component.createIterator());
            return component;
        }
        return null;
    }

    public boolean hasNext() {
        while (!stack.isEmpty()) {
            Iterator<MenuComponent> iterator = stack.peek();
            if (!iterator.hasNext()) {
                stack.pop();
            } else {
                return true;
            }
        }
        return false;
    }

    public void remove() { throw new UnsupportedOperationException(); }
}
