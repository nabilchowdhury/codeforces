import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Nabillionaire on 7/24/17.
 */
public class Twins {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int cur = sc.nextInt();
            sum += cur;
            arr[i] = cur;
        }

        sum /= 2;

        int cur = 0;
        Arrays.sort(arr);
        int i = n - 1;
        for(; i >= 0; i--) {
            cur += arr[i];
            if(cur > sum) break;
        }

        System.out.println(n - i);

    }

}
