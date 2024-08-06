package simpleExample.statePattern;

/**
 * @Description 具体状态类B
 * @Author zhouxinrong
 * @Date 2024/8/5
 * @Version 1.0
 */
public class ConcreteStateB implements ILiftState{
    @Override
    public void handle(String state) {
        System.out.println("ConcreteStateB， 当前状态为：" + state);
    }
}
