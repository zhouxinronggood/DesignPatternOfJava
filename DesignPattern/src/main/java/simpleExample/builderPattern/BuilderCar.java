package simpleExample.builderPattern;

/**
 * @Description 抽象建造者 对象，用来规范构建产品的各个组成部分的步骤。它声明了构建产品各个部分的方法。
 * @Author zhouxinrong
 * @Date 2024/8/5
 * @Version 1.0
 */
public interface BuilderCar {

    void buildEngine();
    void buildHub();
    void buildShell();
    void buildWheel();
    ProductCar getProductCar();
}
