package chapter6;

// turn fan on medium speed

public class CeilingFanMediumCommand implements Command {
    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        prevSpeed = ceilingFan.getSpeed();  // save prev speed
        ceilingFan.medium();    // change speed
    }

    public void undo() {
        //go to prev speed
        switch (prevSpeed) {
            case 3: ceilingFan.high(); break;
            case 2: ceilingFan.medium(); break;
            case 1: ceilingFan.low(); break;
            default: ceilingFan.off(); break;
        }
    }
}

