package wzorce_projektowe.observer.observable;

import wzorce_projektowe.observer.observable.notification.InternetNews;
import wzorce_projektowe.observer.observable.notification.RadioNews;
import wzorce_projektowe.observer.observable.notification.TvNews;
import wzorce_projektowe.observer.observable.observer2.WeatherForecast;

public class Main {

    public static void main(String[] args) {
        WeatherForecast weatherForecast = new WeatherForecast(25, 1003);
        RadioNews radioNews = new RadioNews();
        InternetNews internetNews = new InternetNews();
        TvNews tvNews = new TvNews();
        weatherForecast.registerObserver(radioNews);
        weatherForecast.registerObserver(internetNews);
        weatherForecast.registerObserver(tvNews);
        weatherForecast.notifyObservers();
        weatherForecast.unregisterObserver(tvNews);
        weatherForecast.unregisterObserver(radioNews);
        System.out.println("Nowa prognoza - powiadomienie tylko dla serwisu internetowego:");
        weatherForecast.updateForecast(18,1007);
        System.out.println();
    }
}
