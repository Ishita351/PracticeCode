package chapter3.test;
import chapter3.BarkRecognizer;
import chapter3.DogDoor;
import chapter3.Remote;
import org.junit.Test;

public class DogDoorSimulator {
    @Test
    public void testDog() {
        DogDoor door = new DogDoor();
        Remote remote = new Remote(door);
        BarkRecognizer recognizer = new BarkRecognizer(door);

        recognizer.recognize("Woof");

    }
}

