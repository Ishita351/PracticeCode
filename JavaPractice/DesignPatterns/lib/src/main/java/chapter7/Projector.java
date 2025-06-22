package chapter7;

public class Projector {
    public void on() {
        System.out.println("Projector on");
    }

    public void setInput(StreamingPlayer player) {
        System.out.println("Projector setting input to streaming player");
    }

    public void wideScreenMode() {
        System.out.println("Projector in widescreen mode");
    }

    public void off() {
        System.out.println("Projector off");
    }
}

