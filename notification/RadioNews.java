package wzorce_projektowe.observer.observable.notification;

import wzorce_projektowe.observer.observable.observer2.WeatherForecast;

public class RadioNews implements Observer {
    @Override
    public void update(WeatherForecast weatherForecast) {
        System.out.println("Radio - nowa prognoza pogody: temperatura: "
                + weatherForecast.getTemperature() + " stopni, ciśnienie: "
                + weatherForecast.getPressure() + "hpa");
    }
}
