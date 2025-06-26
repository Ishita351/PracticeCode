package chapter9;

import java.util.Iterator;
import java.util.NoSuchElementException;

//Used by MenuItem — because items don't have children

public class NullIterator implements Iterator<MenuComponent> {
    public boolean hasNext() {
        return false;
    }

    public MenuComponent next() {
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}

