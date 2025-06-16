package tech.blueglacier;

import org.testng.Assert;
import org.testng.annotations.Test;
import tech.blueglacier.exceptions.QueueEmptyException;
import tech.blueglacier.exceptions.QueueFullException;

public class CustomQueueOnCustomLinkedListTest {
    @Test
    public void testQueue() throws QueueEmptyException {
        CustomQueueOnCustomLinkedList queue = new CustomQueueOnCustomLinkedList();
        int pushedValue = 1;
        queue.enqueue(pushedValue);
        queue.enqueue(2);
        queue.enqueue(3);
        int removedVal = queue.dequeue();
        Assert.assertEquals(removedVal, pushedValue);
    }

    @Test
    public void testSQueueSize() throws QueueEmptyException {
        CustomQueueOnCustomLinkedList queue = new CustomQueueOnCustomLinkedList();
        int pushedValue = 1;
        queue.enqueue(pushedValue);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        int removedVal = queue.dequeue();
        int queueSize = queue.size();
        Assert.assertEquals(queueSize, 4);
    }

    @Test(expectedExceptions = QueueFullException.class)
    public void testQueueWithCapacity() throws QueueEmptyException {
        CustomQueueOnCustomLinkedList queue = new CustomQueueOnCustomLinkedList(2);
        int pushedValue = 1;
        queue.enqueue(pushedValue);
        queue.enqueue(2);
        queue.enqueue(3);
        int removedVal = queue.dequeue();
        Assert.assertEquals(removedVal, pushedValue);
    }

    @Test(expectedExceptions = QueueEmptyException.class)
    public void testQueueEmpty() throws QueueEmptyException {
        CustomQueueOnCustomLinkedList queue = new CustomQueueOnCustomLinkedList();
        int pushedValue = 1;
        queue.enqueue(pushedValue);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
    }
}
