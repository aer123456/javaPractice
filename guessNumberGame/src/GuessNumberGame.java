/**
 * Created by huguantao on 16/3/21.
 */

//游戏主体类
public class GuessNumberGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame () {
        //创建三个player对象
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        //三个变量保存猜测的数字
        int guessP1 = 0;
        int guessP2 = 0;
        int guessP3 = 0;

        //三个变量保存是否猜中
        boolean p1IsRight = false;
        boolean p2IsRight = false;
        boolean p3IsRight = false;

        //产生谜底数字
        int targetNumber = (int) (Math.random() * 10);
        System.out.println(" i am thinking a number between 0 and 9....");

        while (true) {
            System.out.println("the number to guess is " + targetNumber);

            //三个玩家开始猜数
            p1.guess();
            p2.guess();
            p3.guess();

            //将三个玩家猜的数赋值保存并输出
            guessP1 = p1.number;
            System.out.println("player one guessed " + guessP1);
            guessP2 = p2.number;
            System.out.println("player two guessed " + guessP2);
            guessP3 = p3.number;
            System.out.println("player three guessed " + guessP3);

            //判断三个玩家是否猜对
            if (guessP1 == targetNumber) {
                p1IsRight = true;
            }
            if (guessP2 == targetNumber) {
                p2IsRight = true;
            }
            if (guessP3 == targetNumber) {
                p3IsRight = true;
            }

            //如果有人猜对,输出并终止游戏
            if (p1IsRight || p2IsRight || p3IsRight) {
                System.out.println("we got a winner!");
                System.out.println("is player one got it right? " + p1IsRight);
                System.out.println("is player two got it right? " + p2IsRight);
                System.out.println("is player three got it right? " + p3IsRight);
                System.out.println("Game is over!");
                break;
            } else {
                System.out.println("no one is right, we have to try again!");
            }
        }
    }
}




