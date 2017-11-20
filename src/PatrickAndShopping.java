import java.util.Scanner;

/**
 * Created by Nabillionaire on 9/8/17.
 */
public class PatrickAndShopping {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE, min3 = Integer.MAX_VALUE;

        for (int i = 0; i < 3; i++) {
            int d1 = sc.nextInt();
            if (d1 < min1) {
                min3 = min2;
                min2 = min1;
                min1 = d1;
            } else if (d1 < min2) {
                min3 = min2;
                min2 = d1;
            } else if (d1 < min3) {
                min3 = d1;
            }
        }

        int p1 = 2*(min1 + min2);
        int p2 = min1 + min2 + min3;

        System.out.println(Math.min(p1, p2));

    }

}
