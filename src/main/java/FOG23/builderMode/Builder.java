package FOG23.builderMode;

/**
 * 抽象的建造者：方法
 *  假设是建房子
 */
public abstract class Builder {
    public abstract void doBuilder1();//打地基
    public abstract void doBuilder2();//钢筋水泥
    public abstract void doBuilder3();//搭设电缆
    public abstract void doBuilder4();//粉刷

    //完工：得到产品，也就是说让真正干的是做
    abstract Product getProduct();
}
