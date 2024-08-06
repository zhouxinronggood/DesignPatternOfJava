package simpleExample.builderPattern;

/**
 * @Description 指挥者（Director）：负责控制构建过程，它调用建造者的方法，按照一定的顺序来构建和组装产品
 * @Author zhouxinrong
 * @Date 2024/8/5
 * @Version 1.0
 */
public class DirectorCar {

    private BuilderCar builderCar;

    public DirectorCar(BuilderCar builderCar)
    {
        this.builderCar = builderCar;
    }

    public ProductCar construct()
    {
        builderCar.buildEngine();
        builderCar.buildHub();
        builderCar.buildShell();
        builderCar.buildWheel();
        return builderCar.getProductCar();
    }

    public static void main(String[] args)
    {
        DirectorCar directorCar = new DirectorCar(new AmericanBuilderCar());
        ProductCar productCar = directorCar.construct();
        System.out.println(productCar);
    }
}
