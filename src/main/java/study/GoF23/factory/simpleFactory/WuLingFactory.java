package study.GoF23.factory.simpleFactory;

/**
 * @Auther: 狼芒
 * @Date: 2021/2/4 22:25
 * @Descrintion:模拟一辆车的简单属性
 * @version: 1.0
 */
public class WuLingFactory implements CarFactory {

    @Override
    public Car getCar() {
        return new WuLing();
    }
}
