package FOG23.observerMode;

/**
 * 抽象被观察者
 */
public interface Observable {

    //添加观察者
    void add(Observer observer);
    //移除观察者
    void remove(Observer observer);

    //通知观察者消息已经发出
    void nofityObservers();
}
