package tech.blueglacier;
import java.util.ArrayList;
import java.util.List;

public class CustomQueue<T> {
    public List<T> queueList;

    public CustomQueue() {
        this.queueList = new ArrayList();
    }

    public void enqueue (T i) {
        this.queueList.add(i);
    }

    public T dequeue() {
        return this.queueList.removeFirst();
    }

    public int size(){
        return this.queueList.size();
    }
}

