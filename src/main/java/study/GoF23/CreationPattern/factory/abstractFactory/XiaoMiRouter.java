package study.GoF23.CreationPattern.factory.abstractFactory;

/**
 * @Auther: 狼芒
 * @Date: 2021/2/10 14:29
 * @Descrintion:小米路由器
 * @version: 1.0
 */
public class XiaoMiRouter implements IRouterProduct {
    @Override
    public void start() {
        System.out.println("小米路由器开启");
    }

    @Override
    public void shutdown() {
        System.out.println("小米路由器关闭");

    }

    @Override
    public void openWifi() {
        System.out.println("小米路由器开启WiFi");

    }

    @Override
    public void Srtting() {
        System.out.println("小米路由器设置");

    }
}
