package FOG23.observerMode.better;

/**
 * 具体的被观察者
 */
public abstract class Observable<T> implements ObverableSource{


    @Override
    public void subscribe(Observer observer) {
        //我们把这订阅的功能让Observable的子类去完成
        subscribeActual(observer);
    }

    protected abstract void subscribeActual(Observer<T> observer);


    //创造被观察者的实例
    public static <T> Observable create(ObservableOnSubscribe<T> source){
        return new ObservableCreate<T>(source);
    }
}
