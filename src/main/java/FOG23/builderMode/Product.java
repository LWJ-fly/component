package FOG23.builderMode;

/**
 * 产品：最终生成的产品类
 */
public class Product {
    private String doBuilder1;
    private String doBuilder2;
    private String doBuilder3;
    private String doBuilder4;

    @Override
    public String toString() {
        return "Product{" +
                "doBuilder1='" + doBuilder1 + '\'' +
                ", doBuilder2='" + doBuilder2 + '\'' +
                ", doBuilder3='" + doBuilder3 + '\'' +
                ", doBuilder4='" + doBuilder4 + '\'' +
                '}';
    }

    public String getDoBuilder1() {
        return doBuilder1;
    }

    public void setDoBuilder1(String doBuilder1) {
        this.doBuilder1 = doBuilder1;
    }

    public String getDoBuilder2() {
        return doBuilder2;
    }

    public void setDoBuilder2(String doBuilder2) {
        this.doBuilder2 = doBuilder2;
    }

    public String getDoBuilder3() {
        return doBuilder3;
    }

    public void setDoBuilder3(String doBuilder3) {
        this.doBuilder3 = doBuilder3;
    }

    public String getDoBuilder4() {
        return doBuilder4;
    }

    public void setDoBuilder4(String doBuilder4) {
        this.doBuilder4 = doBuilder4;
    }
}
