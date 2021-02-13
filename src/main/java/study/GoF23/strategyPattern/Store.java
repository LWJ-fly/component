package study.GoF23.strategyPattern;

/**
 * @Auther: 狼芒
 * @Date: 2021/2/12 23:43
 * @Descrintion:商家，实体类:模拟店铺中商家的一些属性
 * @version: 1.0
 */
public class Store {
    private int storeId;//商家的Id
    private String name;//商品的名称
    private int sellNum;//商品卖出的数量
    private int reputation;//商家的信誉

    @Override
    public String toString() {
        return "Store{" +
                "storeId=" + storeId +
                ", name='" + name + '\'' +
                ", sellNum='" + sellNum + '\'' +
                ", reputation=" + reputation +
                "}";
    }

    public Store(int storeId, String name, int sellNum, int reputation) {
        this.storeId = storeId;
        this.name = name;
        this.sellNum = sellNum;
        this.reputation = reputation;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSellNum() {
        return sellNum;
    }

    public void setSellNum(int sellNum) {
        this.sellNum = sellNum;
    }

    public int getReputation() {
        return reputation;
    }

    public void setReputation(int reputation) {
        this.reputation = reputation;
    }
}
