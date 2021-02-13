package study.GoF23.StructuralPattern.staticProxy.demo1;

/**
 * @Auther: 狼芒
 * @Date: 2021/2/11 18:28
 * @Descrintion:
 * @version: 1.0
 */
public class Proxy implements Rent{
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        host.rent();
    }

    //看房
    public void seeHouse(){
        System.out.println("中介带你看房");
    }
    //租赁合同
    public void contract(){
        System.out.println("代理签合同");
    }
    //收中介费
    public void free(){
        System.out.println("收中介费");
    }
}
