import java.util.Scanner;

/**
 * Created by Nabillionaire on 7/25/17.
 */
public class ArrivalOfTheGeneral {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int minIndex = -1, maxIndex = -1;
        int minSoldier = Integer.MAX_VALUE, maxSoldier = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int cur = sc.nextInt();
            if(cur > maxSoldier) {
                maxSoldier = cur;
                maxIndex = i;
            }
            if(cur <= minSoldier) {
                minSoldier = cur;
                minIndex = i;
            }
        }

        System.out.println( minIndex > maxIndex ?  maxIndex + n - minIndex - 1 : maxIndex + n - minIndex - 2);
    }

}
