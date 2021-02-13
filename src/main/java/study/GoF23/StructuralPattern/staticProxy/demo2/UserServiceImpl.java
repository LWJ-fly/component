package study.GoF23.StructuralPattern.staticProxy.demo2;

/**
 * @Auther: 狼芒
 * @Date: 2021/2/11 23:59
 * @Descrintion:
 * @version: 1.0
 */
public class UserServiceImpl implements UserService {

    public void add() {
        System.out.println("add");
    }

    public void delete() {
        System.out.println("DELETE");

    }

    public void update() {
        System.out.println("update");

    }

    public void query() {
        System.out.println("query");

    }

}
