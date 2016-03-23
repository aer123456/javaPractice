/**
 * Created by huguantao on 16/3/21.
 */
public class dogArrayPractice {
    public static void main(String[] args) {
        //创建dog对象
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Bart";

        //创建dog数组
        Dog[] mydogs = new Dog[3];
        //放狗
        mydogs[0] = new Dog();
        mydogs[1] = new Dog();
        mydogs[2] = dog1;

        //狗命名
        mydogs[0].name = "Fred";
        mydogs[1].name = "Marge";

        //狗老二的名字是?
        System.out.println("last dogs' name is " + mydogs[2].name);

        //狗逐个叫
        int x = 0;
        while (x < mydogs.length) {
            mydogs[x].bark();
            x = x + 1;
        }
    }
}
