package study.GoF23.StructuralPattern.dynamicProxy.demo1;

/**
 * @Auther: 狼芒
 * @Date: 2021/2/12 0:37
 * @Descrintion:房东，有房出租，但是不想改变自己为中介(即：不能随意的修改已有的类/角色)
 * @version: 1.0
 */
public class Host implements Rent {

    @Override
    public void rent() {
        System.out.println("房东出租房子");
    }
}
