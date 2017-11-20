import java.util.Scanner;

/**
 * Created by Nabillionaire on 7/25/17.
 */
public class SoldierAndBananas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt(), n = sc.nextInt(), w = sc.nextInt();

        System.out.println(Math.max(((long)w * (w + 1) / 2) * k - n, 0));

    }

}
