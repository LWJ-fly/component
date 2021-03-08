package FOG23.observerMode.better;

/**
 * 抽象的被观察者
 */
public interface ObverableSource<T> {
    //notify()将给定的Observer订阅功能定义出来
    void subscribe(Observer<T> observer);
}
