package study.GoF23.CreationPattern.factory.abstractFactory;

/**
 * @Auther: 狼芒
 * @Date: 2021/2/10 14:50
 * @Descrintion:
 * @version: 1.0
 */
public class XiaoMifactory implements IProductFactory {
    @Override
    public IphoneProduct iphoneProduct() {
        return new XiaoMiPhone();
    }

    @Override
    public IRouterProduct irouterProduct() {
        return new XiaoMiRouter();
    }
}
