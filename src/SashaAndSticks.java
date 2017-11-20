import java.util.Scanner;

/**
 * Created by Nabillionaire on 7/28/17.
 */
public class SashaAndSticks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt(), k = sc.nextInt();

        System.out.println((n / k) % 2 == 1 ? "YES" : "NO");

    }

}
