package simpleExample.builderPattern;

/**
 * @Description 具体建造者 美系车
 * @Author zhouxinrong
 * @Date 2024/8/5
 * @Version 1.0
 */
public class AmericanBuilderCar implements BuilderCar{

    private ProductCar car;

    public AmericanBuilderCar() {
        car = new ProductCar();
    }

    @Override
    public void buildEngine() {
        System.out.println("AmericanBuilderCar buildEngine");
        car.setEngine("AmericanEngine");
    }

    @Override
    public void buildHub() {
        System.out.println("AmericanBuilderCar buildHub");
        car.setHub("AmericanHub");
    }

    @Override
    public void buildShell() {
        System.out.println("AmericanBuilderCar buildShell");
        car.setShell("AmericanShell");
    }

    @Override
    public void buildWheel() {
        System.out.println("AmericanBuilderCar buildWheel");
        car.setWheel("AmericanWheel");
    }

    @Override
    public ProductCar getProductCar() {
        return car;
    }
}
