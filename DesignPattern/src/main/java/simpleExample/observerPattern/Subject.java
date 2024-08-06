package simpleExample.observerPattern;

/**
 * @Description TODO
 * @Author zhouxinrong
 * @Date 2024/8/2
 * @Version 1.0
 */
public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
