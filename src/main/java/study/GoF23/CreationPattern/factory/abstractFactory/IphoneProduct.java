package study.GoF23.CreationPattern.factory.abstractFactory;

/**
 * @Auther: 狼芒
 * @Date: 2021/2/10 13:40
 * @Descrintion:抽象工厂模式
 * @version: 1.0
 */
public interface IphoneProduct {
    void start();
    void shutdown();
    void callup();
    void sendSMS();
}
