import java.util.Scanner;

/**
 * Created by Nabillionaire on 7/28/17.
 */
public class IlyaAndBankAccount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();



        System.out.println(n > 0 ? n : Math.max((n / 10), (n / 100) * 10 + (n % 10)));

    }
}
