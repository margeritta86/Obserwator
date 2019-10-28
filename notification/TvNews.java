package wzorce_projektowe.observer.observable.notification;

import wzorce_projektowe.observer.observable.observer2.WeatherForecast;

public class TvNews implements Observer {
    @Override
    public void update(WeatherForecast weatherForecast) {
        System.out.println("Telewizja - nowa prognoza pogody: temperatura: "
                + weatherForecast.getTemperature() + " stopni, ciśnienie: "
                + weatherForecast.getPressure() + "hpa");
    }
}
