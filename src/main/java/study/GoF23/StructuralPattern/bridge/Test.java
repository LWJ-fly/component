package study.GoF23.StructuralPattern.bridge;

/**
 * @Auther: 狼芒
 * @Date: 2021/2/11 16:21
 * @Descrintion:测试类
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        //苹果笔记本
        Computer computer = new Laptop(new Apple());
        computer.info();

        //联想台式机
        Computer computer1 = new Desktop(new Lenovo());
        computer1.info();
    }
}
