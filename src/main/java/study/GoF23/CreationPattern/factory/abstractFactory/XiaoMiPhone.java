package study.GoF23.CreationPattern.factory.abstractFactory;

/**
 * @Auther: 狼芒
 * @Date: 2021/2/10 14:21
 * @Descrintion:小米牌的手机
 * @version: 1.0
 */
public class XiaoMiPhone implements IphoneProduct {

    @Override
    public void start() {
        System.out.println("启动小米手机");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭小米手机");

    }

    @Override
    public void callup() {
        System.out.println("小米手机打电话");

    }

    @Override
    public void sendSMS() {
        System.out.println("小米手机发短信");

    }
}
