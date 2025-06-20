package chapter6;

// turn fan off

public class CeilingFanOffCommand implements Command {
    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        prevSpeed = ceilingFan.getSpeed();  // save prev speed
        ceilingFan.off();   // off the fan
    }

    public void undo() {
        switch (prevSpeed) {
            // go to prev speed
            case 3: ceilingFan.high(); break;
            case 2: ceilingFan.medium(); break;
            case 1: ceilingFan.low(); break;
            default: ceilingFan.off(); break;
        }
    }
}

