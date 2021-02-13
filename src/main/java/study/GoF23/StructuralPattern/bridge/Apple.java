package study.GoF23.StructuralPattern.bridge;

/**
 * @Auther: 狼芒
 * @Date: 2021/2/11 16:14
 * @Descrintion:苹果品牌
 * @version: 1.0
 */
public class Apple implements Brand {
    @Override
    public void info() {
        System.out.println("Apple");
    }
}
