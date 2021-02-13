package study.GoF23.CreationPattern.factory.abstractFactory;

/**
 * @Auther: 狼芒
 * @Date: 2021/2/10 14:50
 * @Descrintion:
 * @version: 1.0
 */
public class HuaWeiFactory implements IProductFactory {
    @Override
    public IphoneProduct iphoneProduct() {
        return new HuaWeiphone();
    }

    @Override
    public IRouterProduct irouterProduct() {
        return new HuaWeiRouter();
    }
}
