package simpleExample.decoratorPattern;

/**
 * @Description 具体装饰器对象：奶泡
 * @Author zhouxinrong
 * @Date 2024/8/6
 * @Version 1.0
 */
public class Whip extends CoffeeDecorator{
    public Whip(ICoffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return super.cost() + 5.0;
    }

    @Override
    public String desc() {
        return super.desc() + "Whip";
    }

    @Override
    public String name() {
        return super.name() + "Whip";
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", Whip";
    }

}
