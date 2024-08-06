package simpleExample.iteratorPattern;

import java.util.List;

/**
 * @Description 具体聚合类:商品数据类
 * @Author zhouxinrong
 * @Date 2024/8/5
 * @Version 1.0
 */
public class ProductList extends AbstractObjectList{
    public ProductList(List objects) {
        super(objects);
    }

    //实现创建迭代器对象的具体工厂方法
    @Override
    public IAbstractIterator createIterator() {
        return new ProductIterator(this);
    }
}
