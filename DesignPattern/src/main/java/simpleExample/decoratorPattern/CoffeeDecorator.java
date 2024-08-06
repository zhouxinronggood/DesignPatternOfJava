package simpleExample.decoratorPattern;

/**
 * @Description 抽象装饰器：抽象装饰器类，继承抽象构件类，并持有一个抽象构件类的对象
 * @Author zhouxinrong
 * @Date 2024/8/6
 * @Version 1.0
 */
public class CoffeeDecorator implements ICoffee{

    protected ICoffee coffee;

    public CoffeeDecorator(ICoffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double cost() {
        return coffee.cost();
    }

    @Override
    public String desc() {
        return coffee.desc();
    }

    @Override
    public String name() {
        return coffee.name();
    }

    @Override
    public String getIngredients() {
        return coffee.getIngredients();
    }
}
