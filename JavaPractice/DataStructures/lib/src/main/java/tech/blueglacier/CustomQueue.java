package tech.blueglacier;
import tech.blueglacier.exceptions.QueueEmptyException;
import tech.blueglacier.exceptions.QueueFullException;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class CustomQueue<T> {
    public List<T> queueList;
    private int capacity;

    public CustomQueue() {
        this.queueList = new ArrayList();
        this.capacity = Integer.MAX_VALUE;
    }
    public CustomQueue(int capacity) {
        this.queueList = new ArrayList();
        this.capacity= capacity;
    }

    public void enqueue (T i) throws QueueFullException {
        if (this.queueList.size() < this.capacity) {
            this.queueList.add(i);
        } else {
            throw new QueueFullException("queue is full");
        }
    }

    public T dequeue() throws QueueEmptyException {
        T tObj = null;
        try {
            tObj = this.queueList.removeFirst();
        } catch (NoSuchElementException  e) {
            throw new QueueEmptyException(e.getMessage());
        }
        return tObj;
    }

    public int size(){
        return this.queueList.size();
    }
}

