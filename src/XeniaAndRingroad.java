import java.util.Scanner;

/**
 * Created by Nabillionaire on 7/27/17.
 */
public class XeniaAndRingroad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m = sc.nextInt();

        long res = 0;
        int prev = 1;
        for (int i = 0; i < m; i++) {
            int task = sc.nextInt();
            res += task >= prev ? task - prev : task + n - prev;
            prev = task;
        }

        System.out.println(res);

    }

}
