package simpleExample.statePattern;

/**
 * @Description 测试运行结果
 * @Author zhouxinrong
 * @Date 2024/8/5
 * @Version 1.0
 */
public class StateDemoTest {
    public static void main(String[] args) {
        // 创建状态
        ILiftState liftObj = new ConcreteStateA();
        // 创建上下文
        LiftContext context = new LiftContext();
        // 设置状态
        context.setState(liftObj);
        // 请求
        context.request("open");
    }
}
