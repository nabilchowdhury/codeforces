import java.util.Scanner;

/**
 * Created by Nabillionaire on 7/25/17.
 */
public class CalculatingFunction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        System.out.println(n % 2 == 1 ? -(n/2 + 1) : n/2);
    }

}
