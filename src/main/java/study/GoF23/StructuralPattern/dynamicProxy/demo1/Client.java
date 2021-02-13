package study.GoF23.StructuralPattern.dynamicProxy.demo1;

/**
 * @Auther: 狼芒
 * @Date: 2021/2/12 0:46
 * @Descrintion:
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        //真实角色
        Host host = new Host();
        //代理角色
        proxyinvocationHandler proxyinvocationHandler = new proxyinvocationHandler();
        //通过调用程序处理角色类处理我们要调用的接口对象
        proxyinvocationHandler.setRent(host);
        //这里是动态生成的
        Rent proxy = (Rent) proxyinvocationHandler.getProxy();

        proxy.rent();

        //
    }
}
