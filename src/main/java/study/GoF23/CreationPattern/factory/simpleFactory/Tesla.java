package study.GoF23.CreationPattern.factory.simpleFactory;

/**
 * @Auther: 狼芒
 * @Date: 2021/2/4 22:26
 * @Descrintion:
 * @version: 1.0
 */
public class Tesla implements Car {
    @Override
    public void name() {
        System.out.println("特斯拉");
    }
}
