package study.GoF23.CreationPattern.factory.abstractFactory;

/**
 * @Auther: 狼芒
 * @Date: 2021/2/10 13:40
 * @Descrintion:抽象产品工厂
 * @version: 1.0
 */
public interface IProductFactory {
    //生成手机
    IphoneProduct iphoneProduct();

    //生产路由器
    IRouterProduct irouterProduct();
}
