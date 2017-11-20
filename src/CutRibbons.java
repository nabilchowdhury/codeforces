import java.util.Scanner;

/**
 * Created by Nabillionaire on 7/28/17.
 */
public class CutRibbons {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        int[] memo = new int[n+1];
        memo[0] = 0;

        for (int i = 1; i <= n; i++) {

            int f1 = i - a >= 0 ? memo[i-a] + 1 : 0;
            int f2 = i - b >= 0 ? memo[i-b] + 1 : 0;
            int f3 = i - c >= 0 ? memo[i-c] + 1 : 0;
            memo[i] = Math.max(f1, Math.max(f2, f3));
        }

        System.out.println(memo[n]);

    }

}
