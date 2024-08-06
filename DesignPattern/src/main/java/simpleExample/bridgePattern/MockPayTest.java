package simpleExample.bridgePattern;

import simpleExample.bridgePattern.pay.WxPay;
import simpleExample.bridgePattern.pay.ZfbPay;
import simpleExample.bridgePattern.paymode.CypherPayMode;
import simpleExample.bridgePattern.paymode.FacePayMode;

import java.math.BigDecimal;

/**
 * @Description 模拟支付划账
 * @Author zhouxinrong
 * @Date 2024/8/5
 * @Version 1.0
 */
public class MockPayTest {

    public static void main(String[] args) {
        System.out.println("模拟支付划账：微信支付、刷脸支付方式");
        WxPay wxPay = new WxPay(new FacePayMode());
        System.out.println(wxPay.transfer("123456", "123456", new BigDecimal(100)));
        System.out.println(wxPay.transfer("123456", "123456", new BigDecimal(100)));

        System.out.println("模拟支付划账：支付宝支付、密码支付方式");
        ZfbPay zfbPay = new ZfbPay(new CypherPayMode());
        System.out.println(zfbPay.transfer("123456", "123456", new BigDecimal(100)));
        System.out.println(zfbPay.transfer("123456", "123456", new BigDecimal(100)));
    }
}
