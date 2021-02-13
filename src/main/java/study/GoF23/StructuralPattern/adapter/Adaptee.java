package study.GoF23.StructuralPattern.adapter;

/**
 * @Auther: 狼芒
 * @Date: 2021/2/11 15:32
 * @Descrintion:要适配的类，——网线
 * @version: 1.0
 */
public class Adaptee {

    public void request(){
        System.out.println("连接网线上网");
    }
}
