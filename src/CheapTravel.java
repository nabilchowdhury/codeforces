import java.util.Scanner;

/**
 * Created by Nabillionaire on 7/27/17.
 */
public class CheapTravel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();

        int case1 = n * a;
        int case2 = (int)Math.ceil((double) n / m) * b;
        int case3 = (n / m) * b + (n % m) * a;

        System.out.println(Math.min(case1, Math.min(case2, case3)));

    }

}
