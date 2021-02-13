package study.GoF23.StructuralPattern.staticProxy.demo2;

/**
 * @Auther: 狼芒
 * @Date: 2021/2/12 0:06
 * @Descrintion:
 * @version: 1.0
 */
public class Client {

    public static void main(String[] args) {
        //这是原生的，即房主
        UserServiceImpl userService = new UserServiceImpl();
        userService.add();
        //使用代理后的方法
        UserServiceProxy userServiceProxy = new UserServiceProxy();
        userServiceProxy.setUserService(userService );
        //代理增加了添加日志的功能
        userServiceProxy.add();
    }
}
