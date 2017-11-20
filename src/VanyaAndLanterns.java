import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Nabillionaire on 7/27/17.
 */
public class VanyaAndLanterns {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), l = sc.nextInt();
        int[] lanterns = new int[n];

        for (int i = 0; i < n; i++) {
            lanterns[i] = sc.nextInt();
        }

        if (lanterns.length == 1) {
            System.out.println(Math.max(lanterns[0], l - lanterns[0]));
            return;
        }

        Arrays.sort(lanterns);

        double res = Integer.MIN_VALUE;

        for (int i = 0; i < n - 1; i++) {
            if(i == 0 && lanterns[i] != 0) {
                res = lanterns[i];
            } else {
                res = Math.max(((double)lanterns[i+1] - lanterns[i]) / 2, res);
            }
        }

        res = Math.max(res, l - lanterns[n-1]);

        System.out.println(res);


    }

}
