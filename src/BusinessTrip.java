import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Nabillionaire on 9/8/17.
 */
public class BusinessTrip {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();

        if (K == 0) {
            System.out.println(0);
            return;
        }

        int[] months = new int[12];
        for (int i = 0; i < months.length; i++) months[i] = sc.nextInt();
        Arrays.sort(months);

        int height = 0, count = 0;

        for (int i = months.length - 1; i >= 0; i--) {
            height += months[i];
            count++;
            if (height >= K) break;
        }

        System.out.println(height < K ? -1 : count);

    }

}
