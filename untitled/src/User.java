import java.util.Observable;
import java.util.Observer;

public class User implements Observer{
    private String name;
    public User(String name){
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        // TODO Auto-generated method stub
        System.out.println("微信用户："+name+"，收到微信公众号的内容更新："+arg);
    }


}