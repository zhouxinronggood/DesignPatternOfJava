package simpleExample.adapterPattern.objects;

/**
 * @Description HTMI接口 实现类
 * @Author zhouxinrong
 * @Date 2024/8/5
 * @Version 1.0
 */
public class HDMImpl implements HDMI {
    @Override
    public void connectToHDMI() {
       System.out.println("Connected  to  HDMI  device.");
    }
}
