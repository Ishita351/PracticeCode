package chapter4.test;

import chapter4.Bark;
import chapter4.BarkRecognizer;
import chapter4.DogDoor;
import chapter4.Remote;
import org.junit.Test;

public class DogDoorSimulator {
    @Test
    public void dogTest() {
        DogDoor door = new DogDoor();
        door.addAllowedBark(new Bark("rawlf"));
        door.addAllowedBark(new Bark("roooowlf"));
        door.addAllowedBark(new Bark("rawlf"));
        door.addAllowedBark(new Bark("woof"));

        BarkRecognizer recognizer = new BarkRecognizer(door);
        Remote remote = new Remote(door);

        recognizer.recognize(new Bark("rowlf")); // allowed

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        recognizer.recognize(new Bark("yip"));  // not allowed

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        recognizer.recognize(new Bark("roooowlf")); // allowed
    }
}
