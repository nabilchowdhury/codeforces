import java.util.Scanner;

/**
 * Created by Nabillionaire on 7/28/17.
 */
public class NewYearAndHurry {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), k = sc.nextInt();
        int timeLeft = 240 - k;

        double C = 2 * timeLeft / 5.0;

        int res = (int)Math.floor((-1 + Math.sqrt(1 + (double)4 * C)) / 2);

        System.out.println(Math.min(res, n));

    }

}
