package chapter7;

public class StreamingPlayer {
    public void on() {
        System.out.println("Streaming player on");
    }

    public void play(String movie) {
        System.out.println("Streaming player playing: " + movie);
    }

    public void stop() {
        System.out.println("Streaming player stopped");
    }

    public void off() {
        System.out.println("Streaming player off");
    }
}
