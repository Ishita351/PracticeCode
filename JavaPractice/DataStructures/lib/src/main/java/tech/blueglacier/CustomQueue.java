package tech.blueglacier;
import java.util.ArrayList;
import java.util.List;

public class CustomQueue<T> {
    public List<T> stackQueue;

    public CustomQueue() {
        this.stackQueue = new ArrayList();
    }

    public void enqueue (T i) {
        this.stackQueue.add(i);
    }

    public T dequeue() {
        return this.stackQueue.removeFirst();
    }

    public int size(){
        return this.stackQueue.size();
    }
}

