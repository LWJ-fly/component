package study.GoF23.CreationPattern.builder;

/**
 * @Auther: 狼芒
 * @Date: 2021/2/10 16:41
 * @Descrintion:具体的建造者，工人去完成任务
 * @version: 1.0
 */
public class Worker extends Builder {

    private Product product;

    public Worker() {
        this.product = new Product();
    }

    @Override
    void builderGround() {
        product.setBuilderGround("建造地基");
        System.out.println("建造地基");
    }

    @Override
    void builderSteel() {
        product.setBuilderSteel("搭建钢筋");
        System.out.println("搭建钢筋");
    }

    @Override
    void builderElectricWire() {
        product.setBuilderElectricWire("铺设电路");
        System.out.println("铺设电路");
    }

    @Override
    void builderPaint() {
        product.setBuilderPaint("粉刷墙面");
        System.out.println("粉刷墙面");
    }

    @Override
    Product getProduct() {
        return product;
    }
}
