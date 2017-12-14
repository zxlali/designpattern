package observer;

import java.util.Observable;

/**
 * Created by Alex on 16/9/5 下午3:36.
 */
public class CurrentConditionsDisplay implements java.util.Observer, DisplayElement {
    private float temperature;
    private float humidity;
//    private float pressure;

    private Observable weatherData;

    public CurrentConditionsDisplay(Observable weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override public void display() {
        System.out.println("Current conditions:" + temperature + "F degrees and " + humidity + "% humidity");
    }
}
