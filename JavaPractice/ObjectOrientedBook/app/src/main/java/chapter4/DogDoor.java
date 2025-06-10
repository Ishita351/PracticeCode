package chapter4;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

// dogdoor opens and closes , sets an automatic timer for door open and close , opens and closes door on specific barks
public class DogDoor {
    private boolean open;
    private List<Bark> allowedBarks;
    private Timer timer;

    public DogDoor() {
        this.open = false;
        this.allowedBarks = new ArrayList<>();
    }

    public void open() {
        System.out.println("The dog door opens.");
        open = true;

        // Start a timer to close the door automatically after a delay
        if (timer != null) {
            timer.cancel(); // Cancel any existing timer
        }
        timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                close();
            }
        }, 5000); // Closes after 5 seconds
    }

    public void close() {
        System.out.println("The dog door closes.");
        open = false;
        if (timer != null) {
            timer.cancel(); // Cancel the timer once closed
            timer = null;
        }
    }

    public boolean isOpen() {
        return open;
    }

    // Method to add allowed barks
    public void addAllowedBark(Bark bark) {
        allowedBarks.add(bark);
    }

    // Method to get all allowed barks
    public List<Bark> getAllowedBarks() {
        return allowedBarks;
    }
}
