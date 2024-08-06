package simpleExample.compositePattern;

/**
 * @Description 测试运行结果：客户端调用
 * @Author zhouxinrong
 * @Date 2024/8/6
 * @Version 1.0
 */
public class CompositeDemoTest {

    public static void main(String[] args) {
        //根节点
        Directory rootDir = new Directory("root");

        //树枝节点
        Directory binDir = new Directory("bin");
        //向bin目录中添加叶子节点
        binDir.add(new File("data",20000));
        binDir.add(new File("appData",30000));

        Directory tmpDir = new Directory("tmp");

        Directory usrDir = new Directory("usr");
        Directory mysqlDir = new Directory("mysql");
        mysqlDir.add(new File("my.cnf",20000));
        mysqlDir.add(new File("test.sql",35000));
        usrDir.add(mysqlDir);

        rootDir.add(binDir);
        rootDir.add(tmpDir);
        rootDir.add(mysqlDir);

        rootDir.printList("");
    }
}
