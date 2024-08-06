package simpleExample.compositePattern;

/**
 * @Description File类,叶子节点,表示文件.
 * @Author zhouxinrong
 * @Date 2024/8/6
 * @Version 1.0
 */
public class File extends Entry{

    // 文件名
    private String name;

    // 文件大小
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public Entry add(Entry entry) {
        return null;
    }

    @Override
    public void printList(String prefix) {

        System.out.println(prefix + "/" + this);
    }
}
