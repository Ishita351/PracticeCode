package tech.blueglacier;

public class CustomStackOnCustomLinkedList {
    private CustomLinkedList customLinkedList;

    public CustomStackOnCustomLinkedList() {
        this.customLinkedList = new CustomLinkedList();
    }

    public void push(int i) {
        this.customLinkedList.prePend(i);
    }

    public int pop() {
        return this.customLinkedList.removeLast();
    }
    public int top(){
        return this.customLinkedList.read(0);
    }
    public int size(){
        return this.customLinkedList.getLength();
    }
}
