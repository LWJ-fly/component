package study.GoF23.CreationPattern.factory.abstractFactory;

/**
 * @Auther: 狼芒
 * @Date: 2021/2/10 14:52
 * @Descrintion:获取相应的产品，只需要创建相应的公司工厂，就可以调用其公司方法
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("============小米系列产品============");
        //小米抽象工厂——————只有工厂这一句不同
        XiaoMifactory xiaoMifactory = new XiaoMifactory();

        IphoneProduct iphoneProduct = xiaoMifactory.iphoneProduct();
        iphoneProduct.callup();
        iphoneProduct.sendSMS();

        IRouterProduct iRouterProduct = xiaoMifactory.irouterProduct();
        iRouterProduct.openWifi();
        iRouterProduct.shutdown();
        System.out.println("============华为系列产品============");
        //华为抽象工厂——————只有工厂这一句不同
        HuaWeiFactory huaWeiFactory = new HuaWeiFactory();

        iphoneProduct = huaWeiFactory.iphoneProduct();
        iphoneProduct.callup();
        iphoneProduct.sendSMS();

        iRouterProduct = huaWeiFactory.irouterProduct();
        iRouterProduct.openWifi();
        iRouterProduct.shutdown();
    }
}
