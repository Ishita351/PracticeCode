package tech.blueglacier;

import org.testng.Assert;
import org.testng.annotations.Test;


public class CustomStackTest {

    @Test
    public void testStackOperation() {
        CustomStack stack = new CustomStack();
        int pushedValue = 1;
        stack.push(pushedValue);
        int poppedValue = stack.pop();
        Assert.assertEquals(poppedValue, pushedValue);
    }

    @Test
    public void testMultipleStackOperation() {
        CustomStack stack = new CustomStack();
        int pushedValue = 1;
        stack.push(pushedValue);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        int poppedValue = stack.pop();
        Assert.assertEquals(poppedValue, 5);
    }

    @Test
    public void testCustomStackSize(){
        CustomStack stack = new CustomStack();
        int pushedValue = 1;
        stack.push(pushedValue);
        stack.push(5);
        stack.pop();
        int stackSize = stack.size();
        Assert.assertEquals(stackSize, 1);
    }

    @Test
    public void testCustomStackSeek(){
        CustomStack stack = new CustomStack();
        int pushedValue = 1;
        stack.push(pushedValue);
        stack.push(5);
        stack.pop();
        int topCustomStack = stack.top();
        Assert.assertEquals(topCustomStack, 1);
    }
}
