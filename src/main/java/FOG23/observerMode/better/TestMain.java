package FOG23.observerMode.better;

public class TestMain {
    public static void main(String[] args) {
        //创建接收者
        User jack = new User("jack");
        User cidy = new User("cidy");
        User merry = new User("merry");

//        ObservableOnSubscribe<String> observableOnSubscribe = new ObservableOnSubscribe<String>() {
//            @Override
//            public void subscribe(Emitter<String> emitter) {
//                emitter.onNext("更新的一期文章");
//                emitter.onError(new Throwable("error"));
//                emitter.onComplete();
//            }
//        };

        //创建被观察者
        WechatServer wechatServer = new WechatServer();


        //绑定被观察者
        Observable observable = new ObservableCreate(wechatServer);


        observable.subscribe(jack);
        observable.subscribe(merry);
        observable.subscribe(cidy);

//        Observable.create(wechatServer).subscribe(jack);

    }
}
