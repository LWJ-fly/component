package study.GoF23.CreationPattern.builder;

/**
 * @Auther: 狼芒
 * @Date: 2021/2/10 17:01
 * @Descrintion:指挥，推动工作的进程以及规定方式，工程的核心
 * @version: 1.0
 */
public class Director {

    /**
     * 指挥工人按照指定顺序做某事,需要进行调整的时候，进行切换调用顺序即可
     * @param builder
     * @return
     */
    public Product builer(Builder builder){
        builder.builderGround();
        builder.builderSteel();
        builder.builderElectricWire();
        builder.builderPaint();
        return builder.getProduct();
    }
}
