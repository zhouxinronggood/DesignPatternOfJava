package simpleExample.statePattern;

/**
 * @Description 上下文对象
 * @Author zhouxinrong
 * @Date 2024/8/5
 * @Version 1.0
 */
public class LiftContext {

    private ILiftState state;

    public void setState(ILiftState state){
        this.state = state;
    }

    public void request(String state){
        this.state.handle(state);
    }

}
