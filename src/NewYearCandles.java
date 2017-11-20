import java.util.Scanner;

/**
 * Created by Nabillionaire on 7/26/17.
 */
public class NewYearCandles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt();

        System.out.println(a + (a-1)/(b-1));

    }

}
