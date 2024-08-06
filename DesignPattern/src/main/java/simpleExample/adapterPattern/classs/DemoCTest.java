package simpleExample.adapterPattern.classs;

/**
 * @Description TODO
 * @Author zhouxinrong
 * @Date 2024/8/5
 * @Version 1.0
 */
public class DemoCTest {

    public static void main(String[] args) {
        TypeC typeC = new ExpandTheDockCAdapter();
        typeC.connectToUSB();
    }
}
