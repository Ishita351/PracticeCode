package chapter1;

import chapter1.interfaces.QuackBehaviour;

public class Quack implements QuackBehaviour {
    public void quack(){
        System.out.println("quacks");
    }
}

