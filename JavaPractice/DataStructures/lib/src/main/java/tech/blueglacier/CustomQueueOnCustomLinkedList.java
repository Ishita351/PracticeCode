package tech.blueglacier;

public class CustomQueueOnCustomLinkedList {
    public CustomLinkedList queueLinkedList ;

    public CustomQueueOnCustomLinkedList() {
        this.queueLinkedList = new CustomLinkedList();
    }

    public void enqueue (int element) {
        this.queueLinkedList.add(element);
    }

    public int dequeue() {
        return this.queueLinkedList.removeHead();
    }

    public int size(){
        return this.queueLinkedList.getLength();
    }
}
