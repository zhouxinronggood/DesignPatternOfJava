package simpleExample.bridgePattern.paymode;

/**
 * @Description 支付模式接口
 * @Author zhouxinrong
 * @Date 2024/8/5
 * @Version 1.0
 */
public interface IPayMode {

    /**
     * 安全校验：不同支付模式采用的校验不同
     * @param uId
     * @return
     */
    boolean security(String uId);
}
