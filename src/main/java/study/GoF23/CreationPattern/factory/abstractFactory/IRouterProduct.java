package study.GoF23.CreationPattern.factory.abstractFactory;

/**
 * @Auther: 狼芒
 * @Date: 2021/2/10 14:19
 * @Descrintion:路由器产品接口
 * @version: 1.0
 */
public interface IRouterProduct {
    void start();
    void shutdown();
    void openWifi();
    void Srtting();

}
