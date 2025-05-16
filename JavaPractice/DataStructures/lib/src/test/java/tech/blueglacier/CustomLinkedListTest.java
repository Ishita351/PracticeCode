package tech.blueglacier;

import org.testng.annotations.Test;

public class CustomLinkedListTest {
    @Test
    public void testCustomLinkedList(){
        CustomLinkedList customLinkedList = new CustomLinkedList();
        customLinkedList.add(3);
        System.out.println(customLinkedList.getLength());
        customLinkedList.add(5);
        System.out.println(customLinkedList.getLength());
        customLinkedList.add(9);
        System.out.println(customLinkedList.getLength());
        customLinkedList.add(11);
        System.out.println(customLinkedList.getLength());
        customLinkedList.add(7);
        System.out.println(customLinkedList.getLength());
        System.out.println("########################################");
        System.out.println(customLinkedList);
        System.out.println("########################################");
    }
    @Test
    public void testCustomLinkedListPrePend() {
        CustomLinkedList customLinkedList = new CustomLinkedList();
        customLinkedList.add(3);
        System.out.println(customLinkedList.getLength());
        customLinkedList.add(5);
        System.out.println(customLinkedList.getLength());
        customLinkedList.add(9);
        System.out.println(customLinkedList.getLength());
        customLinkedList.prePend(10);
        System.out.println(customLinkedList.getLength());
        customLinkedList.prePend(15);
        System.out.println(customLinkedList.getLength());
        customLinkedList.prePend(18);
        System.out.println(customLinkedList.getLength());
        System.out.println(customLinkedList);
    }
    @Test
    public void testCustomLinkedListLength(){
        CustomLinkedList customLinkedList = new CustomLinkedList();
        customLinkedList.getLength();
    }
    @Test
    public void testCustomLinkedListInsert(){
        CustomLinkedList customLinkedList = new CustomLinkedList();
        System.out.println(customLinkedList.insert(5,1));
        System.out.println(customLinkedList.insert(-1,1));
        System.out.println(customLinkedList.insert(0,7));
        System.out.println(customLinkedList.getLength());
        customLinkedList.add(6);
        customLinkedList.add(10);
        customLinkedList.add(15);
        customLinkedList.add(18);
        customLinkedList.add(20);
        customLinkedList.add(22);
        System.out.println(customLinkedList.getLength());
        System.out.println(customLinkedList);
        System.out.println(customLinkedList.insert(2,58));
        System.out.println(customLinkedList);
        System.out.println(customLinkedList.getLength());
        System.out.println(customLinkedList.insert(6,62));

        System.out.println(customLinkedList);
        System.out.println(customLinkedList.getLength());
        System.out.println(customLinkedList.insert(9,64));
        System.out.println(customLinkedList);
        System.out.println(customLinkedList.getLength());
    }
    @Test
    public void testJavaReferences(){
        int age = 4;
        int distance = age;
        age = 9;
        System.out.println(age);
        System.out.println(distance);

        String name = "ishita";
        Student first = new Student(age,name);
        System.out.println(first);
        Student second = first ;
        System.out.println(second);
        System.out.println(first);

        first.age= 8;
        System.out.println(second.age);
    }
    private class Student{
        private int age ;
        private String name;

        public Student(int age , String name){
            this.age = age;
            this.name = name;
        }
    }
}
