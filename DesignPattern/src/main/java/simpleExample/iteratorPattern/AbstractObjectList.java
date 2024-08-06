package simpleExample.iteratorPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 抽象聚合类
 * @Author zhouxinrong
 * @Date 2024/8/5
 * @Version 1.0
 */
public abstract class AbstractObjectList {

    protected List<Object> objects = new ArrayList<>();

    public AbstractObjectList(List objects){
        this.objects = objects;
    }

    public void addObject(Object obj){
        this.objects.add(obj);
    }

    public void removeObject(Object obj){
        this.objects.remove(obj);
    }

    public List getObjects(){
        return this.objects;
    }

    //声明创建迭代器对象的抽象工厂方法
    public abstract IAbstractIterator createIterator();

}
