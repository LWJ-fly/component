package study.GoF23.StructuralPattern.dynamicProxy.demo2;

/**
 * @Auther: 狼芒
 * @Date: 2021/2/12 14:29
 * @Descrintion:进行测试，也是调用生成代理对象
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        //真实角色
        UserServiceImpl userService = new UserServiceImpl();
        //代理角色，不存在
        proxyinvocationHandler proxyinvocationHandler = new proxyinvocationHandler();
        //设置要代理的对象
        proxyinvocationHandler.setTarget(userService);
        //动态生成代理类
        UserService proxy = (UserService) proxyinvocationHandler.getProxy();

        proxy.delete();
    }
}
