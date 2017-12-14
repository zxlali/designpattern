package observer;

/**
 * Created by Alex on 16/9/5 下午3:41.
 */
public class ObserverTest {
    public static void main (String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
//        weatherData.setMeashurements(80,65,30.4f);
//        weatherData.setMeashurements(82,70,31.2f);
//        weatherData.setMeashurements(78,90,32.4f);
    }
}
