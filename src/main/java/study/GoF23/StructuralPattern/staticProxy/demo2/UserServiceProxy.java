package study.GoF23.StructuralPattern.staticProxy.demo2;

/**
 * @Auther: 狼芒
 * @Date: 2021/2/11 23:59
 * @Descrintion:
 * @version: 1.0
 */
public class UserServiceProxy implements UserService {
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void add() {
        log("add");
        userService.add();
    }

    public void delete() {
        log("delete");
        userService.delete();
    }

    public void update() {
        log("update");
        userService.update();
    }

    public void query() {
        log("query");
        userService.query();
    }

    //打印日志
    public void log(String msg){
        System.out.println("使用了"+msg+"的方法");
    }
}
