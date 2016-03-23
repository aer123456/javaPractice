/**
 * Created by huguantao on 16/3/22.
 */
public class poolPuzzle3 {
    double area;
    int height;
    int length;

    public static void main (String[] args) {
        int x = 0;
        poolPuzzle3 [] ta = new poolPuzzle3[4];
        while (x < 4) {
            ta[x] = new poolPuzzle3();
            ta[x].height = (x + 1) * 2;
            ta[x].length = x + 4;
            ta[x].setArea();
            System.out.print("triangle " + x + ", area");
            System.out.println(" = " + ta[x].area);
            x = x + 1;
        }
        int y = x;
        x = 27;
        poolPuzzle3 t5 = ta[2];
        ta[2].area = 343;
        System.out.print("y = " + y);
        System.out.println(", t5 area = " + t5.area);
    }

    void setArea() {
        area = (height * length) / 2;
    }

}
