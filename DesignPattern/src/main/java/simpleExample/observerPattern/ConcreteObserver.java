package simpleExample.observerPattern;

/**
 * @Description TODO
 * @Author zhouxinrong
 * @Date 2024/8/2
 * @Version 1.0
 */
public class ConcreteObserver implements Observer{
    private ConcreteSubject subject;
    private int state;

    public ConcreteObserver(ConcreteSubject subject) {
        this.subject = subject;
        this.state = subject.getState();
    }

    @Override
    public void update() {
        this.state = subject.getState();
        System.out.println("Observer  state  updated:  " + state);
    }
}
