package chapter2;

import Chapter2.CurrentConditionsDisplay;
import Chapter2.WeatherData;
import org.testng.annotations.Test;

public class WeatherTest {
    @Test
    public void main() {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay =
                new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
