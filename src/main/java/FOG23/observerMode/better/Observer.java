package FOG23.observerMode.better;

/**
 * 抽象观察者
 */
public interface Observer<T> {

    //用于订阅成功的回调
    void onSubscribe();

    //update收到消息
    void onNext(T t);

    //出错的回调
    void onError(Throwable e);

    //订阅到消息全部发送完成
    void onComplete();

}
