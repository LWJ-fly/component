package study.GoF23.StructuralPattern.staticProxy.demo1;

/**
 * @Auther: 狼芒
 * @Date: 2021/2/11 18:27
 * @Descrintion:
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Host host = new Host();
//        host.rent();//直接找房东租房
        //通过代理
        Proxy proxy = new Proxy();
        //虽然是同样的租房子，但是中介可以附加更多的功能，不用面对房东而达到租房
        proxy.rent();
    }
}
