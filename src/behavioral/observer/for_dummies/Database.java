package behavioral.observer.for_dummies;

import java.util.ArrayList;
import java.util.List;

public class Database implements Subject {

    private List<Observer> observers;
    private String operation;
    private String record;

    public Database() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(operation, record));
    }

    public void editRecord(String operation, String record) {
        this.operation = operation;
        this.record = record;
        notifyObservers();
    }

}
