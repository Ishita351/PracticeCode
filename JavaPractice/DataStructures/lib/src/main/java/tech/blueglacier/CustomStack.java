package tech.blueglacier;

import java.util.ArrayList;
import java.util.List;

public class CustomStack {
    private List stackArray;

    public CustomStack() {
        this.stackArray = new ArrayList();
    }

    public void push(int i) {
        this.stackArray.add(i);
    }

    public int pop() {
        return (int) this.stackArray.removeLast();
    }
    public int top(){
        return (int) this.stackArray.getLast();
    }
    public int size(){
        return (int) this.stackArray.size();
    }
}
