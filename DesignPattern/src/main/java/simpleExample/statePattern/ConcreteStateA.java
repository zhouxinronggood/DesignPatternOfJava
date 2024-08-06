package simpleExample.statePattern;

/**
 * @Description 具体状态类A
 * @Author zhouxinrong
 * @Date 2024/8/5
 * @Version 1.0
 */
public class ConcreteStateA implements ILiftState{
    @Override
    public void handle(String state) {
        System.out.println("ConcreteStateA, 当前状态为：" + state);
    }
}
