import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Nabillionaire on 7/25/17.
 */
public class Puzzles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m = sc.nextInt();
        int[] puzzles = new int[m];

        for (int i = 0; i < m; i++) {
            puzzles[i] = sc.nextInt();
        }

        Arrays.sort(puzzles);

        int res = Integer.MAX_VALUE;

        for (int i = 0; i < m - n + 1; i++) {
            res = Math.min(puzzles[n - 1 + i] - puzzles[i], res);
        }

        System.out.println(res);
    }

}
