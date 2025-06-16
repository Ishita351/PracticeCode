package tech.blueglacier;

import tech.blueglacier.exceptions.*;

public class CustomQueueOnCustomLinkedList {
    public CustomLinkedList queueLinkedList ;
    private int capacity;

    public CustomQueueOnCustomLinkedList() {
        this.queueLinkedList = new CustomLinkedList();
        this.capacity = Integer.MAX_VALUE;
    }
    public CustomQueueOnCustomLinkedList(int capacity){
        this.capacity = capacity;
        this.queueLinkedList = new CustomLinkedList(this.capacity);
    }

    public void enqueue(int element) throws QueueFullException {
        try {
            this.queueLinkedList.add(element);
        }catch(ListFullException e){
            throw new QueueFullException(e.getMessage());
        }
    }

    public int dequeue() throws QueueEmptyException {
        try{
            return this.queueLinkedList.removeHead();
        }catch(EmptyListException e){
            throw new QueueEmptyException(e.getMessage());
        }

    }

    public int size(){
        return this.queueLinkedList.getLength();
    }
}
