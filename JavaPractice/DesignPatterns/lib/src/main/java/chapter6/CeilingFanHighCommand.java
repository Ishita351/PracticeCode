package chapter6;

//turn fan on high speed
public class CeilingFanHighCommand implements Command {
    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        prevSpeed = ceilingFan.getSpeed();  // save current speed
        ceilingFan.high();  //change speed
    }

    public void undo() {
        //switching to previous speed of fan
        switch (prevSpeed) {
            case 3: ceilingFan.high(); break;
            case 2: ceilingFan.medium(); break;
            case 1: ceilingFan.low(); break;
            default: ceilingFan.off(); break;
        }
    }
}

