package FOG23.observerMode.better;

import FOG23.observerMode.Observable;
import FOG23.observerMode.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体的被观察者，用微信公众号进行模拟
 */
public class WechatServer implements ObservableOnSubscribe {

    @Override
    public void subscribe(Emitter emitter) {
        emitter.onNext("写一个");
    }
}
