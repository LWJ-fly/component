package study.GoF23.CreationPattern.factory.abstractFactory;

/**
 * @Auther: 狼芒
 * @Date: 2021/2/10 14:24
 * @Descrintion:华为手机厂商
 * @version: 1.0
 */
public class HuaWeiphone implements IphoneProduct {

    @Override
    public void start() {
        System.out.println("启动华为手机");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭华为手机");

    }

    @Override
    public void callup() {
        System.out.println("华为手机打电话");

    }

    @Override
    public void sendSMS() {
        System.out.println("华为手机发短信");

    }
}
