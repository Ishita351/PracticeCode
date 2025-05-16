package chapter1;

public class Duckling extends Duck{
    public Duckling(){
        flyBehaviour = new Flying();
        quackBehaviour = new Quack();
    }
    public void display() {
        System.out.println("im a duckling");

    }

}
