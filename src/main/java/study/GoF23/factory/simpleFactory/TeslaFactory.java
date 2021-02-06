package study.GoF23.factory.simpleFactory;

/**
 * @Auther: 狼芒
 * @Date: 2021/2/4 22:26
 * @Descrintion:
 * @version: 1.0
 */
public class TeslaFactory implements CarFactory {

    @Override
    public Car getCar() {
        return new Tesla();
    }
}
