package FOG23.observerMode;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体的被观察者，用微信公众号进行模拟
 */
public class WechatServer implements Observable{

    //观察者清单
    private static List<Observer> list = new ArrayList<>();
    //发送给用户的消息
    private String message;

    //消息发布
    public void pushMessage(String message){
        this.message = message;
        System.out.println("更新了消息："+message);
        //通知所有订阅者更新
        nofityObservers();
    }

    @Override
    public void add(Observer observer) {
        list.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void nofityObservers() {

        for (Observer observer:list) {
            observer.update(message);
        }
    }
}
