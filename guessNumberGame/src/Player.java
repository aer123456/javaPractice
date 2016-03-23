/**
 * Created by huguantao on 16/3/21.
 */
//玩家类
public class Player {
    //要被猜的数字
    int number = 0;

    public void guess () {
        number = (int) (Math.random() * 10);
        System.out.println("i guess " + number);
    }
}
