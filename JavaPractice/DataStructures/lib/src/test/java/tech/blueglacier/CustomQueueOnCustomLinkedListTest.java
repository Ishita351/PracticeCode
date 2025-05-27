package tech.blueglacier;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomQueueOnCustomLinkedListTest {
    @Test
    public void testQueue() {
        CustomQueueOnCustomLinkedList queue = new CustomQueueOnCustomLinkedList();
        int pushedValue = 1;
        queue.enqueue(pushedValue);
        queue.enqueue(2);
        queue.enqueue(3);
        int removedVal = queue.dequeue();
        Assert.assertEquals(removedVal, pushedValue);
    }

    @Test
    public void testSQueueSize(){
        CustomQueueOnCustomLinkedList queue = new CustomQueueOnCustomLinkedList();
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
}
