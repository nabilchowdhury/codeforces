import java.util.Scanner;

/**
 * Created by Nabillionaire on 7/24/17.
 */
public class StonesOnTheTable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        char prev = s.charAt(0);
        int count = 0;
        for (int i = 1; i < n; i++) {
            if(s.charAt(i) == prev) count++;
            prev = s.charAt(i);
        }

        System.out.println(count);

    }

}
