package study.GoF23.CreationPattern.builder;

/**
 * @Auther: 狼芒
 * @Date: 2021/2/10 17:03
 * @Descrintion:
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        //指挥
        Director director = new Director();
        //指挥具体的工人，顺序完成某事，不同的工人，可以完成不同的事情，有平房，有高楼，不同能力的人可以进行不同的建造
        Product builer = director.builer(new Worker());
        System.out.println(builer.toString());
    }
}
