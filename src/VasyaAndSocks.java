import java.util.Scanner;

/**
 * Created by Nabillionaire on 7/25/17.
 */
public class VasyaAndSocks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m = sc.nextInt();

        int res = 0;
        int mod = 0;

        while (n > 0) {
            res += n + mod;
            mod = n % m;
            n /= m;
        }

        System.out.println(res);

    }

}
