package wzorce_projektowe.observer.observable.notification;

import wzorce_projektowe.observer.observable.observer2.WeatherForecast;

public interface Observer {

    void update(WeatherForecast weatherForecast);
}
