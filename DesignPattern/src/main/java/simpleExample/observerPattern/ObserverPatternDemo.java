package simpleExample.observerPattern;

/**
 * @Description TODO
 * @Author zhouxinrong
 * @Date 2024/8/2
 * @Version 1.0
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        Observer observer1 = new ConcreteObserver(subject);
        Observer observer2 = new ConcreteObserver(subject);
        subject.addObserver(observer1);
        subject.addObserver(observer2);
        System.out.println("First  state  change:  15");
        subject.setState(15);
        System.out.println("Second  state  change:  20");
        subject.setState(20);
        subject.removeObserver(observer1);
        System.out.println("Third  state  change:  25");
        subject.setState(25);
    }
}
