package FOG23.observerMode.better;

/**
 * 用来创建被观察者对象
 */
public class ObservableCreate<T> extends Observable<T> {

    ObservableOnSubscribe<T> source;

    public ObservableCreate(ObservableOnSubscribe<T> source) {
        this.source = source;
    }

    @Override
    public void subscribe(Observer observer) {
        super.subscribe(observer);
    }

    //如果订阅功能要实现，在这里就应该通知Observer消息更新成功
    @Override
    protected void subscribeActual(Observer observer) {
        //调用Observer。onNext();方法
        CreateEmitter<T> parent = new CreateEmitter<>(observer);
        observer.onSubscribe();
        //把观察者和被观察者绑定在一起（订阅）
        source.subscribe(parent);
    }
}
