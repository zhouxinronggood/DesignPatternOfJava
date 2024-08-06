package simpleExample.decoratorPattern;

/**
 * @Description 具体组件：一般的咖啡
 * @Author zhouxinrong
 * @Date 2024/8/6
 * @Version 1.0
 */
public class SimpleCoffee implements ICoffee{
    @Override
    public double cost() {
        return 20.0;
    }

    @Override
    public String desc() {
        return "普通咖啡";
    }

    @Override
    public String name() {
        return "simple coffee";
    }

    @Override
    public String getIngredients() {
        return "咖啡豆";
    }
}
