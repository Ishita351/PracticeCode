package chapter7;

import org.testng.annotations.Test;

public class HomeTheatreTest {
    @Test
    public void testHomeTheatre() {
        Amplifier amp = new Amplifier();
        StreamingPlayer player = new StreamingPlayer();
        Projector projector = new Projector();
        Screen screen = new Screen();
        TheaterLights lights = new TheaterLights();
        PopcornPopper popper = new PopcornPopper();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, player, projector, screen, lights, popper);

        homeTheater.watchMovie("ABCD movie");
        homeTheater.endMovie();
    }


}

