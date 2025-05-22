package tech.blueglacier;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class CustomLinkedListTest {
    @Test
    public void testCustomLinkedListSuccessfulSearch(){
        int elementToSearch=5;
        CustomLinkedList customLinkedList = new CustomLinkedList();
        Random random = new Random();
        customLinkedList.add(random.nextInt(0,500));
        customLinkedList.add(elementToSearch);
        customLinkedList.add(random.nextInt(0,500));
        customLinkedList.add(random.nextInt(0,500));
        customLinkedList.add(random.nextInt(0,500));
        customLinkedList.add(random.nextInt(0,500));
        customLinkedList.add(random.nextInt(0,500));
        customLinkedList.add(random.nextInt(0,500));
        Assert.assertEquals(customLinkedList.search(elementToSearch),1);
        System.out.println(customLinkedList);
    }
    @Test
    public void testCustomLinkedListAdd() {
        CustomLinkedList customLinkedList = new CustomLinkedList();
        customLinkedList.add(3);
        Assert.assertEquals(customLinkedList.getLength(), 1);
        customLinkedList.add(5);
        Assert.assertEquals(customLinkedList.getLength(), 2);
        customLinkedList.add(9);
        Assert.assertEquals(customLinkedList.getLength(), 3);
        customLinkedList.add(11);
        Assert.assertEquals(customLinkedList.getLength(), 4);
        customLinkedList.add(7);
        Assert.assertEquals(customLinkedList.getLength(), 5);
        System.out.println(customLinkedList);
    }

    @Test
    public void testCustomLinkedListPrePend() {
        CustomLinkedList customLinkedList = new CustomLinkedList();
        customLinkedList.add(3);
        customLinkedList.add(5);
        customLinkedList.add(9);
        Assert.assertEquals(customLinkedList.getLength(), 3);
        customLinkedList.prePend(10);
        Assert.assertEquals(customLinkedList.getLength(), 4);
        customLinkedList.prePend(15);
        Assert.assertEquals(customLinkedList.getLength(), 5);
        customLinkedList.prePend(18);
        Assert.assertEquals(customLinkedList.getLength(), 6);
        System.out.println(customLinkedList);
    }

    @Test
    public void testCustomLinkedListLength() {
        CustomLinkedList customLinkedList = new CustomLinkedList();
        customLinkedList.getLength();
    }

    @Test
    public void testCustomLinkedListInsert() {
        CustomLinkedList customLinkedList = new CustomLinkedList();
        Assert.assertFalse(customLinkedList.insert(5, 1));
        Assert.assertFalse(customLinkedList.insert(-1, 1));
        Assert.assertTrue(customLinkedList.insert(0, 7));
        Assert.assertEquals(customLinkedList.getLength() , 1);
        customLinkedList.add(6);
        customLinkedList.add(10);
        customLinkedList.add(15);
        customLinkedList.add(18);
        customLinkedList.add(20);
        customLinkedList.add(22);
        Assert.assertEquals(customLinkedList.getLength() , 7);
        Assert.assertTrue(customLinkedList.insert(2, 58));
        System.out.println(customLinkedList);
        Assert.assertEquals(customLinkedList.getLength() , 8);
        Assert.assertTrue(customLinkedList.insert(6, 62));
        System.out.println(customLinkedList);
        Assert.assertEquals(customLinkedList.getLength() , 9);
        Assert.assertFalse(customLinkedList.insert(9, 64));
        System.out.println(customLinkedList);
        Assert.assertEquals(customLinkedList.getLength() , 9);
    }

    @Test
    public void testCustomLinkedListDelete() {
        CustomLinkedList customLinkedList = new CustomLinkedList();
        customLinkedList.add(3);
        customLinkedList.add(5);
        customLinkedList.add(8);
        customLinkedList.add(11);
        customLinkedList.add(15);
        customLinkedList.add(18);
        customLinkedList.add(23);
        System.out.println(customLinkedList);
        Assert.assertEquals(customLinkedList.getLength() , 7);
        Assert.assertTrue(customLinkedList.delete(5));
        System.out.println(customLinkedList);
        Assert.assertEquals(customLinkedList.getLength() , 6);
        Assert.assertTrue(customLinkedList.delete(0));
        System.out.println(customLinkedList);
        Assert.assertEquals(customLinkedList.getLength() , 5);
        Assert.assertTrue(customLinkedList.delete(4));
        System.out.println(customLinkedList);
        Assert.assertEquals(customLinkedList.getLength() , 4);
    }

}
