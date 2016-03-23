import java.lang.String;

public class HeapQuize {
    int id = 0;
    public static void main (String[] args) {
        int x = 0;
        HeapQuize [] hq = new HeapQuize[5];
        while (x < 3) {
            hq[x] = new HeapQuize();
            hq[x].id = x;
            x = x + 1;
        }
        hq[3] = hq[1];
        hq[4] = hq[1];
        hq[3] = null;
        hq[4] = hq[0];
        hq[0] = hq[3];
        hq[3] = hq[2];
        hq[2] = hq[0];
        //指出谁引用了谁, 堆对象一共三个: id=0 id=1 id=2
        //四个引用变量 hq的四个数组
    }
}