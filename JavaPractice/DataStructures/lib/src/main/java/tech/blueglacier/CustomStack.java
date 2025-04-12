package tech.blueglacier;

import java.util.ArrayList;
import java.util.List;

public class CustomStack<T> {
    private List<T> stackArray;

    public CustomStack() {
        this.stackArray = new ArrayList();
    }

    public void push(T i) {
        this.stackArray.add(i);
    }

    public T pop() {
        return this.stackArray.removeLast();
    }
    public T top(){
        return this.stackArray.getLast();
    }
    public int size(){
        return this.stackArray.size();
    }
}
