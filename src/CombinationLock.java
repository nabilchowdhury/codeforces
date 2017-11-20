import java.util.Scanner;

/**
 * Created by Nabillionaire on 7/28/17.
 */
public class CombinationLock {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String original = sc.next(), actual = sc.next();

        int total = 0;

        for(int i = 0; i < n; i++){
            int o1 = original.charAt(i) - '0';
            int a1 = actual.charAt(i) - '0';

            total += Math.min( Math.max(o1, a1) - Math.min(o1, a1), Math.min(o1, a1) + 10 - Math.max(o1, a1) );

        }

        System.out.println(total);

    }

}
