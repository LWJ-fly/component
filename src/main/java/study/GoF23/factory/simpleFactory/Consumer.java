package study.GoF23.factory.simpleFactory;

/**
 * @Auther: 狼芒
 * @Date: 2021/2/4 22:27
 * @Descrintion:模拟顾客买车动作
 * @version: 1.0
 */
public class Consumer {
    public static void main(String[] args) {
        Car wuling = new WuLingFactory().getCar();
        Car tesLa = new TeslaFactory().getCar();
        wuling.name();
        tesLa.name();
/*
    如果未来出现更多的车，那么可以实现车工厂的工厂即CarFactory
    然后开立自己的品牌以及工厂，不对已经存在的工厂和品牌进行改变，更大的灵活性
 */
    }
}
