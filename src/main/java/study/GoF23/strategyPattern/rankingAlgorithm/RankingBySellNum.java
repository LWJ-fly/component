package study.GoF23.strategyPattern.rankingAlgorithm;

import study.GoF23.strategyPattern.Store;

import java.util.Comparator;

/**
 * @Auther: 狼芒
 * @Date: 2021/2/12 23:48
 * @Descrintion:排名算法：按照店铺出售商品数量进行排名
 * @version: 1.0
 */
public class RankingBySellNum implements Comparator<Store> {
    @Override
    public int compare(Store o1, Store o2) {
        if (o1.getSellNum()>o2.getSellNum()) return 1;
        else if (o1.getSellNum()<o2.getSellNum()) return -1;
        return 0;
    }
}
