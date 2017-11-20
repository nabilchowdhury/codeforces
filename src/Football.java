import java.util.Scanner;

/**
 * Created by Nabillionaire on 7/24/17.
 */
public class Football {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int count = 1;
        char prev = s.charAt(0);
        for(int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);

            if(c == prev) count++;
            else count = 1;

            if(count >= 7) break;

            prev = c;
        }

        System.out.println(count >= 7 ? "YES" : "NO");

    }

}
