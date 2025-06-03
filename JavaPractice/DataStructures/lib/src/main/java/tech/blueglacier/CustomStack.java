package tech.blueglacier;

import tech.blueglacier.exceptions.EmptyStackException;
import tech.blueglacier.exceptions.StackFullException;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class CustomStack<T> {
    private int capacity;
    private List<T> stackArray;

    public CustomStack(int capacity) {
        this.capacity = capacity;
        this.stackArray = new ArrayList(this.capacity);
    }

    public CustomStack() {
        this.stackArray = new ArrayList();
        this.capacity = Integer.MAX_VALUE;
    }

    public void push(T i) throws StackFullException {
        if (this.stackArray.size() < this.capacity) {
            this.stackArray.add(i);
        } else {
            throw new StackFullException("stack is full");
        }
    }

    public T pop() throws EmptyStackException {
        T tObj = null;
        try {
            tObj = this.stackArray.removeLast();
        } catch (NoSuchElementException | NullPointerException e) {
            throw new EmptyStackException(e.getMessage());
        } catch (Exception e) {
            System.out.println("exception started from here");
            throw e;
        } finally {
            System.out.println("empty stack action covered");
        }
        return tObj;
    }

    public T top() {
        return this.stackArray.getLast();
    }

    public int size() {
        return this.stackArray.size();
    }
}
