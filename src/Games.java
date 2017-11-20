import java.util.Scanner;

/**
 * Created by Nabillionaire on 7/26/17.
 */
public class Games {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] home = new int[101];
        int[] away = new int[101];

        int res = 0;

        for (int i = 0; i < n; i++) {
            int h = sc.nextInt();
            int a = sc.nextInt();

            res += away[h];
            res += home[a];

            home[h]++;
            away[a]++;
        }

        System.out.println(res);

    }
}
