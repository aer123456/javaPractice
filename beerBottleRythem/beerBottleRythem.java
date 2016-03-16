//啤酒瓶童谣:99个瓶子,开始每次递减的时候唱相应的句子说现在有多少瓶
public class beerBottleRythem {
    public static void main (String[] args) {

        //初始为99,默认的单词是复数
        int beerNum = 3;
        String word = "bottles";

        //啤酒瓶个数要大于0
        while (beerNum > 0) {
            //一瓶的时候应该是单数
            if (beerNum == 1) {
                word = "bottle";
            }

            //唱歌,并递减瓶数
            System.out.println(beerNum + " " + word + "of beer on the wall.");
            System.out.println (beerNum + " " + word + "of beer.");
            System.out.println ("Take one down.");
            System.out.println ("Pass it around.");
            beerNum = beerNum -1;

            if (beerNum > 0) {
//                System.out.println (beerNum + " " + word + "of beer on the wall.");
            } else {
                System.out.println ("No more bottles of beer on the wall!");
            }
        }
    }
}

