import java.util.Scanner;

/**
 * Created by Nabillionaire on 7/28/17.
 */
public class YandexQualification2017A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 1;

        int prev = sc.nextInt();

        for (int i = 0; i < n - 1; i++) {

            int cur = sc.nextInt();
            count += cur - prev >= 0 ? 0 : 1;
            prev = cur;

        }

        System.out.println(count);

    }
}
