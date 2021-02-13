package study.GoF23.StructuralPattern.adapter;

/**
 * @Auther: 狼芒
 * @Date: 2021/2/11 15:35
 * @Descrintion:客户端类——电脑，没有网线接口
 * @version: 1.0
 */
public class Computer {
    //我们的电脑需要一个网络转换器
    public void net(Net2Usb adapter){
        //上网的具体实现，找一个转接头
        adapter.handleRequest();
    }

    //进行模拟上网
    public static void main(String[] args) {
        //电脑 适配器 网线
        Computer computer = new Computer();//电脑
        Adaptee adaptee = new Adaptee();//网线
        Adapter1 adapter = new Adapter1(adaptee);//网络转换器

        computer.net(adapter);
    }
}
