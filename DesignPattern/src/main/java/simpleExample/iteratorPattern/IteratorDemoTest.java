package simpleExample.iteratorPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 测试运行结果
 * @Author zhouxinrong
 * @Date 2024/8/5
 * @Version 1.0
 */
public class IteratorDemoTest {
    public static void main(String[] args) {
        List products = new ArrayList();
        products.add("商品1");
        products.add("商品2");
        products.add("商品3");
        products.add("商品4");

        AbstractObjectList list;
        IAbstractIterator iterator;
        // 创建聚合对象
        list = new ProductList(products);
        // 创建迭代器对象
        iterator = list.createIterator();

        System.out.println("正向遍历");
        while (!iterator.isLast()){
            System.out.println(iterator.getNextItem()+",");
            iterator.next();
        }
        System.out.println("逆向遍历");
        while (!iterator.isFirst()){
            System.out.println(iterator.getPreviousItem()+",");
            iterator.previous();
        }
    }
}
