package simpleExample.observerPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @Author zhouxinrong
 * @Date 2024/8/2
 * @Version 1.0
 */
public class ConcreteSubject implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }
    public int getState() {
        return state;
    }
}
