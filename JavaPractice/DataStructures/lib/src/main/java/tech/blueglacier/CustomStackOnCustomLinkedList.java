package tech.blueglacier;

import tech.blueglacier.exceptions.EmptyStackException;
import tech.blueglacier.exceptions.ListFullException;
import tech.blueglacier.exceptions.StackFullException;

public class CustomStackOnCustomLinkedList {
    private CustomLinkedList customLinkedList;
    private int capacity;

    public CustomStackOnCustomLinkedList() {
        this.customLinkedList = new CustomLinkedList();
        this.capacity = Integer.MAX_VALUE ;
    }
    public CustomStackOnCustomLinkedList(int capacity) {
        this.capacity = capacity ;
        this.customLinkedList = new CustomLinkedList(this.capacity);
    }

    public void push(int i) throws StackFullException {
        try {
            this.customLinkedList.prePend(i);
        } catch (ListFullException e) {
            throw new StackFullException(e.getMessage());
        }

    }

    public int pop() throws EmptyStackException {
        return this.customLinkedList.removeLast();
    }

    public int top() {
        return this.customLinkedList.read(0);
    }

    public int size() {
        return this.customLinkedList.getLength();
    }
}
