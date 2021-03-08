package FOG23.observerMode;

public class TestMain {
    public static void main(String[] args) {
        //创建一个微信公众号(被观察者)
        Observable observable = new WechatServer();
        //创建用户(观察者)
        Observer jack = new User("jack");
        Observer jerry = new User("jerry");
        Observer merry = new User("merry");
        Observer sidy = new User("sidy");
        //用户订阅公众号(观察者绑定被观察者)
        observable.add(jack);
        observable.add(jerry);
        observable.add(merry);
        observable.add(sidy);
        //公众号更新消息
        ((WechatServer)observable).pushMessage("一期新的更新");

    }
}
