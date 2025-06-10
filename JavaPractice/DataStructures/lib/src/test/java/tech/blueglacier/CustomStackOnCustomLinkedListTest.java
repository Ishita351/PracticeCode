package tech.blueglacier;

import org.testng.Assert;
import org.testng.annotations.Test;
import tech.blueglacier.exceptions.EmptyListException;
import tech.blueglacier.exceptions.EmptyStackException;
import tech.blueglacier.exceptions.StackFullException;

public class CustomStackOnCustomLinkedListTest {
    @Test
    public void testCustomStack() throws StackFullException, EmptyStackException {
        CustomStackOnCustomLinkedList customStackOnCustomLinkedList = new CustomStackOnCustomLinkedList();
        customStackOnCustomLinkedList.push(1);
        Assert.assertEquals(customStackOnCustomLinkedList.pop(), 1);
        customStackOnCustomLinkedList.push(3);
        customStackOnCustomLinkedList.push(5);
        customStackOnCustomLinkedList.push(12);
        customStackOnCustomLinkedList.push(15);
        Assert.assertEquals(customStackOnCustomLinkedList.pop(), 15);

    }

    @Test(expectedExceptions = EmptyStackException.class)
    public void testCustomStackTop() throws StackFullException, EmptyStackException {
        CustomStackOnCustomLinkedList customStackOnCustomLinkedList = new CustomStackOnCustomLinkedList();
        Assert.assertEquals(customStackOnCustomLinkedList.top(), -1);
        customStackOnCustomLinkedList.push(4);
        customStackOnCustomLinkedList.push(14);
        customStackOnCustomLinkedList.push(6);
        Assert.assertEquals(customStackOnCustomLinkedList.top(), 6);
    }

    @Test
    public void testCustomStackLength() throws StackFullException {
        CustomStackOnCustomLinkedList customStackOnCustomLinkedList = new CustomStackOnCustomLinkedList();
        Assert.assertEquals(customStackOnCustomLinkedList.size(), 0);
        customStackOnCustomLinkedList.push(4);
        customStackOnCustomLinkedList.push(14);
        customStackOnCustomLinkedList.push(6);
        Assert.assertEquals(customStackOnCustomLinkedList.size(), 3);
    }

    @Test(expectedExceptions = StackFullException.class)
    public void testCustomStackFull() throws StackFullException {
        CustomStackOnCustomLinkedList customStackOnCustomLinkedList = new CustomStackOnCustomLinkedList(3);
        customStackOnCustomLinkedList.push(0);
        customStackOnCustomLinkedList.push(3);
        customStackOnCustomLinkedList.push(4);
        customStackOnCustomLinkedList.push(6);
    }
}
