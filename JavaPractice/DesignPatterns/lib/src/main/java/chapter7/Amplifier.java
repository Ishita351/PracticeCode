package chapter7;

public class Amplifier {
    public void on() {
        System.out.println("Amplifier on");
    }

    public void setStreamingPlayer(StreamingPlayer player) {
        System.out.println("Amplifier setting streaming player");
    }

    public void setSurroundSound() {
        System.out.println("Amplifier surround sound on");
    }

    public void setVolume(int level) {
        System.out.println("Amplifier setting volume to " + level);
    }

    public void off() {
        System.out.println("Amplifier off");
    }
}
