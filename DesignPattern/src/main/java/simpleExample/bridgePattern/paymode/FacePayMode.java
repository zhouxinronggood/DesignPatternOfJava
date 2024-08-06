package simpleExample.bridgePattern.paymode;

/**
 * @Description 刷脸支付模式
 * @Author zhouxinrong
 * @Date 2024/8/5
 * @Version 1.0
 */
public class FacePayMode implements IPayMode{
    @Override
    public boolean security(String uId) {
        System.out.println("刷脸支付，风控校验脸部识别");
        return true;
    }
}
