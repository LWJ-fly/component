package FOG23.observerMode.better;

public class CreateEmitter<T> implements Emitter<T>{

    Observer observer;

    public CreateEmitter(Observer observer) {
        this.observer = observer;
    }

    @Override
    public void onNext(T t) {
        observer.onNext(t);
    }

    @Override
    public void onError(Throwable throwable) {
        observer.onError(throwable);
    }

    @Override
    public void onComplete() {
        observer.onComplete();
    }
}