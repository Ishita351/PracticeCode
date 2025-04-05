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
    public void testOperation(){
        CustomStack stack = new CustomStack();
        int pushedValue = 1;
        stack.push(pushedValue);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        int poppedValue = stack.pop();
        int sizeArray = stack.size();
        Assert.assertEquals(sizeArray, 3);
    }

    @Test
    public void testTop(){
        CustomStack stack = new CustomStack();
        int pushedValue = 1;
        stack.push(pushedValue);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        int poppedValue = stack.pop();
        int topArray = stack.top();
        Assert.assertEquals(topArray, 4);
    }
}
