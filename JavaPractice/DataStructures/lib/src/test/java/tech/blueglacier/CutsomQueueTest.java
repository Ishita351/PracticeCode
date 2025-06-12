package tech.blueglacier;

import org.testng.Assert;
import org.testng.annotations.Test;
import tech.blueglacier.exceptions.QueueEmptyException;
import tech.blueglacier.exceptions.QueueFullException;

public class CutsomQueueTest {
    @Test
    public void testQueue() throws QueueFullException , QueueEmptyException {
        CustomQueue<Integer> queue = new CustomQueue<>();
        int pushedValue = 1;
        queue.enqueue(pushedValue);
        queue.enqueue(2);
        queue.enqueue(3);
        int removedVal = queue.dequeue();
        Assert.assertEquals(removedVal, pushedValue);
    }

    @Test(expectedExceptions = QueueFullException.class)
    public void testQueueWithCapacity() throws QueueFullException , QueueEmptyException {
        CustomQueue<Integer> queue = new CustomQueue<>(2);
        int pushedValue = 1;
        queue.enqueue(pushedValue);
        queue.enqueue(2);
        queue.enqueue(3);
        int removedVal = queue.dequeue();
        Assert.assertEquals(removedVal, pushedValue);
    }

    @Test
    public void testSQueueSize() throws QueueFullException , QueueEmptyException{
        CustomQueue<Integer> queue = new CustomQueue<>(6);
        int pushedValue = 1;
        queue.enqueue(pushedValue);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        int removedVal = queue.dequeue();
        int queueSize = queue.size();
        Assert.assertEquals(queueSize,4 );
    }

    @Test(expectedExceptions = QueueEmptyException.class)
    public void testQueueEmpty() throws QueueFullException , QueueEmptyException {
        CustomQueue<Integer> queue = new CustomQueue<>(3);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
    }
}
