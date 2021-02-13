package study.GoF23.CreationPattern.builder;

/**
 * @Auther: 狼芒
 * @Date: 2021/2/10 16:06
 * @Descrintion:建造者模式
 * @version: 1.0
 */
public abstract class Builder {
    abstract void builderGround();//建造地基
    abstract void builderSteel();//搭建钢筋
    abstract void builderElectricWire();//铺设电路
    abstract void builderPaint();//粉刷墙面

    //完工了
    abstract Product getProduct();
}
