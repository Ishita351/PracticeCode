package chapter2.test;

import chapter2.DogDoor;
import chapter2.Remote;
import org.junit.Test;

public class DogDoorTest {
    @Test
    public void  dogTest(){
        DogDoor door = new DogDoor();
        Remote remote = new Remote(door);
        remote.pressButton();
        remote.pressButton();
        remote.pressButton();
    }
}

