package study.GoF23.StructuralPattern.staticProxy.demo1;

/**
 * @Auther: 狼芒
 * @Date: 2021/2/11 18:25
 * @Descrintion:房东
 * @version: 1.0
 */
public class Host implements Rent {

    @Override
    public void rent() {
        System.out.println("房东出租房子");
    }
}
