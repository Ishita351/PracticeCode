package tech.blueglacier;

import org.testng.Assert;
import org.testng.annotations.Test;
import tech.blueglacier.exceptions.EmptyStackException;
import tech.blueglacier.exceptions.StackFullException;


public class CustomStackTest {

    @Test
    public void testStackOperation() throws EmptyStackException , StackFullException {
        CustomStack<Integer> stack = new CustomStack();
        int pushedValue = 1;
        stack.push(pushedValue);
        int poppedValue = stack.pop();
        Assert.assertEquals(poppedValue, pushedValue);
    }

    @Test
    public void testStackOperationWithCapacity() throws EmptyStackException , StackFullException {
        int stackCapacity = 1;
        CustomStack<Integer> stack = new CustomStack(stackCapacity);
        int pushedValue = 1;
        stack.push(pushedValue);
        int poppedValue = stack.pop();
        Assert.assertEquals(poppedValue, pushedValue);
    }

    @Test
    public void testMultipleStackOperation() throws EmptyStackException ,  StackFullException{
        int stackCapacity = 4;
        CustomStack<Integer> stack = new CustomStack(stackCapacity);
        int pushedValue = 1;
        stack.push(pushedValue);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        int poppedValue = stack.pop();
        Assert.assertEquals(poppedValue, 5);
    }

    @Test
    public void testCustomStackSize() throws EmptyStackException ,  StackFullException{
        int stackCapacity = 2 ;
        CustomStack<Integer> stack = new CustomStack(stackCapacity);
        int pushedValue = 1;
        stack.push(pushedValue);
        stack.push(5);
        stack.pop();
        int stackSize = stack.size();
        Assert.assertEquals(stackSize, 1);
    }

    @Test
    public void testCustomStackSeek() throws EmptyStackException ,  StackFullException{
        int stackCapacity = 2;
        CustomStack<Integer> stack = new CustomStack(stackCapacity);
        int pushedValue = 1;
        stack.push(pushedValue);
        stack.push(5);
        stack.pop();
        int topCustomStack = stack.top();
        Assert.assertEquals(topCustomStack, 1);
    }
    @Test
    public void testCustomStackForString() throws EmptyStackException ,  StackFullException{
        int stackCapacity = 2;
        CustomStack<String> stack = new CustomStack(stackCapacity);
        String pushedValue = "ishita";
        stack.push(pushedValue);
        stack.push("rishit");
        stack.pop();
        String topCustomStack = stack.top();
        Assert.assertEquals(topCustomStack, "ishita");
    }

    @Test(expectedExceptions = EmptyStackException.class)
    public void testCustomStackEmptyException() throws EmptyStackException{
        int stackCapacity = 1;
        CustomStack<Integer> stack = new CustomStack<>(stackCapacity);
        stack.pop();
    }

    @Test
    public void testCustomStackSizeLimit(){
        int stackCapacity = 1;
        CustomStack<Integer> stack = new CustomStack<>(stackCapacity);
    }

    @Test(expectedExceptions =  StackFullException.class)
    public void testCustomStackCapacityCheck() throws StackFullException{
        int stackCapacity = 4;
        CustomStack<Integer> stack = new CustomStack<>(stackCapacity);
        stack.push(2);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
    }
}
