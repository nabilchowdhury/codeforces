import java.util.Scanner;

/**
 * Created by Nabillionaire on 7/24/17.
 */
public class Tram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int res = 0;
        int cur = 0;

        for(int i = 0; i < n; i++) {
            cur = cur - sc.nextInt() + sc.nextInt();
            res = Math.max(res, cur);
        }

        System.out.println(res);

    }

}
