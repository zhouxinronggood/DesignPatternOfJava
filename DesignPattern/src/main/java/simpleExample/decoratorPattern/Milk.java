package simpleExample.decoratorPattern;

/**
 * @Description 具体装饰器对象：牛奶
 * @Author zhouxinrong
 * @Date 2024/8/6
 * @Version 1.0
 */
public class Milk extends CoffeeDecorator{
    public Milk(ICoffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return super.cost() + 2.0;
    }

    @Override
    public String desc() {
        return super.desc() + "Milk";
    }

    @Override
    public String name() {
        return super.name() + "Milk";
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", Milk";
    }

}
