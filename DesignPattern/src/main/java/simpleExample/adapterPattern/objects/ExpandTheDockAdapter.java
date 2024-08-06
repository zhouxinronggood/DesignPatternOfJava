package simpleExample.adapterPattern.objects;

/**
 * @Description 适配器类：扩展坞
 * @Author zhouxinrong
 * @Date 2024/8/5
 * @Version 1.0
 */
public class ExpandTheDockAdapter implements TypeC{
    // 适配器持有一个对象
    private  HDMImpl  hdmi;

    public  ExpandTheDockAdapter(HDMImpl  hdmi)  {
        this.hdmi  =  hdmi;
    }

    @Override
    public  void  connectToUSB()  {
        // 实际上我们将Type-C连接转换为HDMI连接
        hdmi.connectToHDMI();
    }

}
