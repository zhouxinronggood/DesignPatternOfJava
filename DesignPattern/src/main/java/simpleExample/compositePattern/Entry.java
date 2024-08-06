package simpleExample.compositePattern;

/**
 * @Description 抽象类，用来定义File类和Directory类的共性内容
 * @Author zhouxinrong
 * @Date 2024/8/6
 * @Version 1.0
 */
public abstract class Entry {

    // 获取文件名
    public abstract String getName();

    // 获取文件大小
    public abstract int getSize();

    /**
     * 添加文件夹或文件
     */
    public abstract Entry add(Entry entry);

    /**
     * 显示指定目录下的所有信息
     */
    public abstract void printList(String prefix);

    @Override
    public String toString() {
        return getName() + "(" +getSize() + ")";
    }
}
