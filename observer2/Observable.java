package wzorce_projektowe.observer.observable.observer2;

import wzorce_projektowe.observer.observable.notification.Observer;

public interface Observable {

    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();
}
