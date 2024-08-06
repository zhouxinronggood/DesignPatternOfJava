package simpleExample.bridgePattern.pay;

import simpleExample.bridgePattern.paymode.IPayMode;

import java.math.BigDecimal;

/**
 * @Description 支付抽象类对象
 * @Author zhouxinrong
 * @Date 2024/8/5
 * @Version 1.0
 */
public abstract class AbstractPay {

    /**
     * 桥接对象：支付模式
     */
    protected IPayMode payMode;

    public AbstractPay(IPayMode payMode)
    {
        this.payMode = payMode;
    }

    //模拟划账功能
    public abstract String transfer(String uId, String tradeId, BigDecimal amount);
}
