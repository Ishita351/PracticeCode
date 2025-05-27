package tech.blueglacier;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomStackOnCustomLinkedListTest {
    @Test
    public void testCustomStack(){
        CustomStackOnCustomLinkedList customStackOnCustomLinkedList = new CustomStackOnCustomLinkedList();
        customStackOnCustomLinkedList.push(1);
        Assert.assertEquals(customStackOnCustomLinkedList.pop(),1);
        customStackOnCustomLinkedList.push(3);
        customStackOnCustomLinkedList.push(5);
        customStackOnCustomLinkedList.push(12);
        customStackOnCustomLinkedList.push(15);
        Assert.assertEquals(customStackOnCustomLinkedList.pop() , 15);

    }
    @Test
    public void testCustomStackTop(){
        CustomStackOnCustomLinkedList customStackOnCustomLinkedList = new CustomStackOnCustomLinkedList();
        Assert.assertEquals(customStackOnCustomLinkedList.top(),-1);
        customStackOnCustomLinkedList.push(4);
        customStackOnCustomLinkedList.push(14);
        customStackOnCustomLinkedList.push(6);
        Assert.assertEquals(customStackOnCustomLinkedList.top(),6);
    }

    @Test
    public void testCustomStackLength(){
        CustomStackOnCustomLinkedList customStackOnCustomLinkedList = new CustomStackOnCustomLinkedList();
        Assert.assertEquals(customStackOnCustomLinkedList.size(),0);
        customStackOnCustomLinkedList.push(4);
        customStackOnCustomLinkedList.push(14);
        customStackOnCustomLinkedList.push(6);
        Assert.assertEquals(customStackOnCustomLinkedList.size(),3);
    }
}
