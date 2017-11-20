import java.util.Scanner;

/**
 * Created by Nabillionaire on 7/25/17.
 */
public class EvenOdds {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong(), k = sc.nextLong();

        long res = k > (long)Math.ceil(n / 2.0) ? 2 + 2 * (k - 1 - (long)Math.ceil(n / 2.0)) : 1 + 2 * ((long)k - 1);
        System.out.println(res);

    }

}
