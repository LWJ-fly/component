package study.GoF23.strategyPattern.rankingAlgorithm;

import study.GoF23.strategyPattern.Store;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/**
 * @Auther: 狼芒
 * @Date: 2021/2/12 23:48
 * @Descrintion:排名算法：按照店铺的信誉值进行排名
 * @version: 1.0
 */
public class RankingByReputation implements Comparator<Store> {
    @Override
    public int compare(Store o1, Store o2) {
        if (o1.getReputation()>o2.getReputation()) return 1;
        else if (o1.getReputation()<o2.getReputation()) return -1;
        return 0;
    }

    @Override
    public Comparator<Store> reversed() {
        return null;
    }

    @Override
    public Comparator<Store> thenComparing(Comparator<? super Store> other) {
        return null;
    }

    @Override
    public <U> Comparator<Store> thenComparing(Function<? super Store, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return null;
    }

    @Override
    public <U extends Comparable<? super U>> Comparator<Store> thenComparing(Function<? super Store, ? extends U> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Store> thenComparingInt(ToIntFunction<? super Store> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Store> thenComparingLong(ToLongFunction<? super Store> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Store> thenComparingDouble(ToDoubleFunction<? super Store> keyExtractor) {
        return null;
    }
}
