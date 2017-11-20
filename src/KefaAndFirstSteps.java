import java.util.Scanner;

/**
 * Created by Nabillionaire on 7/25/17.
 */
public class KefaAndFirstSteps {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int res = Integer.MIN_VALUE;
        int prev = Integer.MIN_VALUE;
        int cur = 0;
        for (int i = 0; i < n; i++) {
            int c = sc.nextInt();
            if(c >= prev) cur++;
            else cur = 1;
            res = Math.max(cur, res);
            prev = c;
        }

        System.out.println(res);
    }

}
