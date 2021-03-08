package FOG23.builderMode;

public class Worker extends Builder{
    private Product product;

    public Worker() {
        this.product = new Product();
    }

    @Override
    public void doBuilder1() {
        product.setDoBuilder1("打地基");
        System.out.println("打地基");
    }

    @Override
    public void doBuilder2() {
        product.setDoBuilder2("钢筋水泥");
        System.out.println("钢筋水泥");
    }

    @Override
    public void doBuilder3() {
        product.setDoBuilder3("搭设电缆");
        System.out.println("搭设电缆");
    }

    @Override
    public void doBuilder4() {
        product.setDoBuilder4("粉刷");
        System.out.println("粉刷");
    }

    @Override
    Product getProduct() {
        return null;
    }
}
