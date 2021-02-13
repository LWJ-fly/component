package study.GoF23.strategyPattern;

import java.util.Comparator;

/**
 * @Auther: 狼芒
 * @Date: 2021/2/13 0:21
 * @Descrintion:策略模式，进行排序的比较器
 * @version: 1.0
 */
public class Sorter<T> {

    //这里使用冒泡排序
    public void sort(T[] arr, Comparator<T> comparator){
        for (int i = 0; i < arr.length-1; i++) {
            int minPos = i;
            for (int j = i; j < arr.length; j++) {
                minPos = comparator.compare(arr[j],arr[minPos])==-1?j:minPos;
            }
            swap(arr,i,minPos);
        }
    }

    //进行交换
    private void swap(T[] arr, int i, int j){
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
