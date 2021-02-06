package study.GoF23.factory.simpleFactory;

/**
 * @Auther: 狼芒
 * @Date: 2021/2/4 22:25
 * @Descrintion:模拟一辆车的简单属性
 * @version: 1.0
 */
public class WuLing implements Car {
    @Override
    public void name() {
        System.out.println("五菱宏光");
    }
}
