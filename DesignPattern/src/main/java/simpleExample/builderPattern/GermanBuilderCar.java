package simpleExample.builderPattern;

/**
 * @Description 具体建造者 德系车
 * @Author zhouxinrong
 * @Date 2024/8/5
 * @Version 1.0
 */
public class GermanBuilderCar implements BuilderCar{

    private ProductCar car;

    public void ProductCar() {
        car = new ProductCar();
    }

    @Override
    public void buildEngine() {
        System.out.println("GermanBuilderCar buildEngine");
        car.setEngine("GermanEngine");
    }

    @Override
    public void buildHub() {
        System.out.println("GermanBuilderCar buildHub");
        car.setHub("GermanHub");
    }

    @Override
    public void buildShell() {
        System.out.println("GermanBuilderCar buildShell");
        car.setShell("GermanShell");
    }

    @Override
    public void buildWheel() {
        System.out.println("GermanBuilderCar buildWheel");
        car.setWheel("GermanWheel");
    }

    @Override
    public ProductCar getProductCar() {
        return car;
    }
}
