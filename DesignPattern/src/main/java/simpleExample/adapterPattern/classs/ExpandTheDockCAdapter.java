package simpleExample.adapterPattern.classs;

/**
 * @Description TODO
 * @Author zhouxinrong
 * @Date 2024/8/5
 * @Version 1.0
 */
public class ExpandTheDockCAdapter extends HDMImpl implements TypeC{
    @Override
    public void connectToUSB() {
        super.connectToHDMI();
    }
}
