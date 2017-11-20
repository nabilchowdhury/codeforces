import java.util.Scanner;

/**
 * Created by Nabillionaire on 9/8/17.
 */
public class DuffAndMeat {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int total = 0;
        int accumulated = sc.nextInt();
        int minCost = sc.nextInt();

        for (int i = 1; i < N; i++) {
            int amount = sc.nextInt();
            int cost = sc.nextInt();

            if (cost < minCost) {
                total += accumulated * minCost;
                accumulated = amount;
                minCost = cost;
            } else {
                accumulated += amount;
            }
        }

        if (accumulated > 0) total += minCost * accumulated;

        System.out.println(total);

    }

}
