package FOG23.observerMode.better;

public class User implements Observer {

    private String name ;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void onSubscribe() {
        System.out.println(name+"onSubscribe");
    }

    @Override
    public void onNext(Object o) {
        System.out.println(name+"收到消息"+o);
    }

    @Override
    public void onError(Throwable e) {
        System.out.println(name+e);
    }

    @Override
    public void onComplete() {
        System.out.println(name+"onComplete");
    }
}
