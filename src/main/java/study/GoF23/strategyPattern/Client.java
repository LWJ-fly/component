package study.GoF23.strategyPattern;

import study.GoF23.strategyPattern.rankingAlgorithm.RankingById;
import study.GoF23.strategyPattern.rankingAlgorithm.RankingByName;
import study.GoF23.strategyPattern.rankingAlgorithm.RankingByReputation;
import study.GoF23.strategyPattern.rankingAlgorithm.RankingBySellNum;

import java.util.Arrays;

/**
 * @Auther: 狼芒
 * @Date: 2021/2/12 23:41
 * @Descrintion:策略模式的演示类
 * @version: 1.0
 */
public class Client {
    private static Store[] store;
    //一个购物网站，对店铺进行排名的时候，有多种排名方式
    public static void main(String[] args) {
        //初始化店铺
        init();
        //随机打乱初始化的店铺
        randomStore();
        //打乱后的店铺
        System.out.println(Arrays.toString(store));

        //进行排序调用
        Sorter<Store> storeSorter = new Sorter<>();
        //调用不同的排序方式，可以实现不同的排序，如果需要增加新的排序方式，可以直接添加相应的类，而不用去修改代码
        storeSorter.sort(store,new RankingById());
        storeSorter.sort(store,new RankingByName());
        storeSorter.sort(store,new RankingByReputation());
        storeSorter.sort(store,new RankingBySellNum());

        //输出排序后的数组
        System.out.println(Arrays.toString(store));
    }

    //初始化店铺
    private static void init(){
        store = new Store[]{
                new Store(1, "aa", 1, 1)
                ,new Store(2, "bb", 2, 2)
                ,new Store(3, "cc", 3, 3)
                ,new Store(4, "dd", 4, 4)
                ,new Store(5, "ee", 5, 5)
        };
    }

    //编写一个随机打乱的方法
    private static void randomStore(){
        int num = (int) (Math.random()*10);
        for (int i = 0; i < num; i++) {
            int mid = (int) (Math.random()*10)%store.length;
            swapStore(mid);
        }
    }
    //交换两个参数位置
    private static void swapStore(int mid){
        if (mid==0||mid>=store.length) return;
        Store s = store[0];
        store[0] = store[mid];
        store[mid] = s;
    }
}
