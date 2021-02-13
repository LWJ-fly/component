package study.GoF23.CreationPattern.builder;

/**
 * @Auther: 狼芒
 * @Date: 2021/2/10 16:38
 * @Descrintion:产品——房子
 * @version: 1.0
 */
public class Product {
    private String builderGround;//建造地基
    private String builderSteel;//搭建钢筋
    private String builderElectricWire;//铺设电路
    private String builderPaint;//粉刷墙面

    @Override
    public String toString() {
        return "Product{" +
                "builderGround='" + builderGround + '\'' +
                ", builderSteel='" + builderSteel + '\'' +
                ", builderElectricWire='" + builderElectricWire + '\'' +
                ", builderPaint='" + builderPaint + '\'' +
                '}';
    }

    public String getBuilderGround() {
        return builderGround;
    }

    public void setBuilderGround(String builderGround) {
        this.builderGround = builderGround;
    }

    public String getBuilderSteel() {
        return builderSteel;
    }

    public void setBuilderSteel(String builderSteel) {
        this.builderSteel = builderSteel;
    }

    public String getBuilderElectricWire() {
        return builderElectricWire;
    }

    public void setBuilderElectricWire(String builderElectricWire) {
        this.builderElectricWire = builderElectricWire;
    }

    public String getBuilderPaint() {
        return builderPaint;
    }

    public void setBuilderPaint(String builderPaint) {
        this.builderPaint = builderPaint;
    }
}
