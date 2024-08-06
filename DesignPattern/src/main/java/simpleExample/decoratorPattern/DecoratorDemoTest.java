package simpleExample.decoratorPattern;

/**
 * @Description 测试运行结果：相当于客户端调用装饰者模式
 * @Author zhouxinrong
 * @Date 2024/8/6
 * @Version 1.0
 */
public class DecoratorDemoTest {

    public static void main(String[] args) {
        ICoffee coffee = new SimpleCoffee();
        System.out.println("Cost: " + coffee.cost());
        System.out.println("Desc: " + coffee.desc());
        System.out.println("Name: " + coffee.name());
        System.out.println("Ingredients: " + coffee.getIngredients());

        ICoffee milkCoffee = new Milk(coffee);
        System.out.println("Cost: " + milkCoffee.cost());
        System.out.println("Desc: " + coffee.desc());
        System.out.println("Name: " + coffee.name());
        System.out.println("Ingredients: " + milkCoffee.getIngredients());

        ICoffee whipCoffee = new Whip(milkCoffee);
        System.out.println("Cost: " + whipCoffee.cost());
        System.out.println("Desc: " + coffee.desc());
        System.out.println("Name: " + coffee.name());
        System.out.println("Ingredients: " + whipCoffee.getIngredients());
    }
}
