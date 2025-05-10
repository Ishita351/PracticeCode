package tech.blueglacier;

import org.testng.annotations.Test;

public class CustomLinkedListTest {
    @Test
    public void testCustomLinkedList(){
        CustomLinkedList customLinkedList = new CustomLinkedList();
        customLinkedList.add(3);
        customLinkedList.add(5);
        customLinkedList.add(9);
        customLinkedList.add(11);
        customLinkedList.add(7);
        System.out.println("########################################");
        System.out.println(customLinkedList);
        System.out.println("########################################");
    }
    @Test
    public void testCustomLinkedListPrePend() {
        CustomLinkedList customLinkedList = new CustomLinkedList();
        customLinkedList.add(3);
        customLinkedList.add(5);
        customLinkedList.add(9);
        customLinkedList.prePend(10);
        customLinkedList.prePend(15);
        customLinkedList.prePend(18);
        System.out.println(customLinkedList);
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
