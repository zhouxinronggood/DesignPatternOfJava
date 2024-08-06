package simpleExample.bridgePattern.paymode;

/**
 * @Description 密码支付模式
 * @Author zhouxinrong
 * @Date 2024/8/5
 * @Version 1.0
 */
public class CypherPayMode implements IPayMode{
    @Override
    public boolean security(String uId) {
        System.out.println("密码支付，风控校验环境安全");
        return true;
    }
}
