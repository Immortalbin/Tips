package observer;

import lombok.Getter;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class Server implements IObservable {

    private final Set<IObserver> observers;

    @Getter
    private String msg = "I am alive!";


    Server(){
        observers = new HashSet<>();
    }

    @Override
    public void register(IObserver observer) {
        Objects.requireNonNull(observer, "Observer can not be null");
        observers.add(observer);
    }

    @Override
    public void unregister(IObserver observer) {
        Objects.requireNonNull(observer, "Observer can not be null");
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(IObserver::update);
    }
}
