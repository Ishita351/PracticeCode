package chapter4;

import java.util.Timer;
import java.util.TimerTask;

//remote to open and close the door
public class Remote {
    private DogDoor door;

    public Remote(DogDoor door) {
        this.door = door;
    }
    public void pressButton() {
        if (door.isOpen()) {
            door.close();
        } else {
            door.open();
        }
    }
}
