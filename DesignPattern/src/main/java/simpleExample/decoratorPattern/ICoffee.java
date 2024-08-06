package simpleExample.decoratorPattern;

/**
 * @Description 抽象组件：咖啡对象
 * @Author zhouxinrong
 * @Date 2024/8/6
 * @Version 1.0
 */
public interface ICoffee {

    /**
     * 费用
     * @return
     */
    double cost();

    /**
     * 描述
     * @return
     */
    String desc();

    /**
     * 名称
     * @return
     */
    String name();

    /**
     * 成分
     * @return
     */
    String getIngredients();
}
