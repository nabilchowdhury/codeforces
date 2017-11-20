import java.util.Scanner;

/**
 * Created by Nabillionaire on 7/24/17.
 */
public class DominoPiling {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int res = 0;

        if (m % 2 == 0) {
            res = m / 2 * n;
        } else if(n % 2 == 0) {
            res = n / 2 * m;
        } else {
            res = n / 2 * m + m / 2;
        }

        System.out.println(res);


    }

}
