package study.GoF23.StructuralPattern.bridge;

/**
 * @Auther: 狼芒
 * @Date: 2021/2/11 16:13
 * @Descrintion:联想品牌
 * @version: 1.0
 */
public class Lenovo implements Brand {
    @Override
    public void info() {
        System.out.println("Lenovo");
    }
}
