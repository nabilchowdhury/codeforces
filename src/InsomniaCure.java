import java.util.Scanner;

/**
 * Created by Nabillionaire on 7/25/17.
 */
public class InsomniaCure {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt(), l = sc.nextInt(), m = sc.nextInt(), n = sc.nextInt(), d = sc.nextInt();
        int res = 0;

        for (int i = 1; i <= d; i++ ) {
            if (i % k == 0) res++;
            else if (i % l == 0) res++;
            else if (i % m == 0) res++;
            else if (i % n == 0) res++;
        }

        System.out.println(res);

    }

}
