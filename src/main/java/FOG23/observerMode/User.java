package FOG23.observerMode;

public class User implements Observer{

    private String name;
    private String message;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(Object msg) {
        this.message = (String) msg;
        read();
    }

    void read(){
        System.out.println(this.name+"\t收到推送消息\t"+this.message);
    }
}
