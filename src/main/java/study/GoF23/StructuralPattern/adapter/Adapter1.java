package study.GoF23.StructuralPattern.adapter;

/**
 * @Auther: 狼芒
 * @Date: 2021/2/11 15:39
 * @Descrintion:真正的适配器，需要连接USB，连接网线
 * @version: 1.0
 *
 * 1、继承（类适配器，拥有单继承，有限制性）
 * 2、组合（对象适配器，常用的方法）
 */
public class Adapter1 implements Net2Usb{

    private Adaptee adaptee;

    public Adapter1(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void handleRequest() {
        adaptee.request();//使用父类的上网功能
    }
}
