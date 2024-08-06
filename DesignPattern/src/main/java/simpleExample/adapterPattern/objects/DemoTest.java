package simpleExample.adapterPattern.objects;

/**
 * @Description 测试demo运行
 * @Author zhouxinrong
 * @Date 2024/8/5
 * @Version 1.0
 */
public class DemoTest {
    public static void main(String[] args) {
        // 创建被适配的HDMI对象
        HDMImpl hdmiDevice = new HDMImpl();
        // 创建适配器，并传入HDMI对象
        TypeC typeCAdapter = new ExpandTheDockAdapter(hdmiDevice);
        // 使用Type-C适配器连接到USB（实际上是转换为HDMI连接）
        typeCAdapter.connectToUSB();
    }
}
