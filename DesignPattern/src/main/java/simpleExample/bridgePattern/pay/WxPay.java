package simpleExample.bridgePattern.pay;

import simpleExample.bridgePattern.paymode.IPayMode;

import java.math.BigDecimal;

/**
 * @Description 支付渠道实现类 微信支付
 * @Author zhouxinrong
 * @Date 2024/8/5
 * @Version 1.0
 */
public class WxPay extends AbstractPay{

    public WxPay(IPayMode payMode) {
        super(payMode);
    }

    @Override
    public String transfer(String uId, String tradeId, BigDecimal amount) {
        System.out.println("微信渠道支付划账开始......");
        boolean security = payMode.security(uId);
        System.out.println("微信渠道支付风险校验: " + uId + " , " + tradeId +" , " + security);
        if(!security){
            System.out.println("微信渠道支付划账失败!");
            return "500";
        }
        System.out.println("微信渠道划账成功! 金额: "+ amount);
        return "200";
    }
}
