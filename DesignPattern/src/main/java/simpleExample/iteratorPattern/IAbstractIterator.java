package simpleExample.iteratorPattern;

/**
 * @Description 迭代器接口
 * @Author zhouxinrong
 * @Date 2024/8/5
 * @Version 1.0
 */
public interface IAbstractIterator {
    /**
     * 移至下一个元素
     */
    public void next();

    /**
     * 判断是否为最后一个元素
     * @return
     */
    public boolean isLast();

    /**
     * 移至上一个元素
     */
    public void previous();

    /**
     * 判断是否为第一个元素
     * @return
     */
    public boolean isFirst();

    /**
     * 获取下一个元素
     * @return
     */
    public Object getNextItem();

    /**
     * 获取上一个元素
     * @return
     */
    public Object getPreviousItem();
}
