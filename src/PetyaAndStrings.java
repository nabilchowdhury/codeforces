import java.util.Scanner;

/**
 * Created by Nabillionaire on 7/24/17.
 */
public class PetyaAndStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();

        for(int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            c1 += c1 >= 'A' && c1 <= 'Z' ? 'a' - 'A' : 0;
            c2 += c2 >= 'A' && c2 <= 'Z' ? 'a' - 'A' : 0;

            if (c1 < c2) {
                System.out.println(-1);
                return;
            } else if (c1 > c2) {
                System.out.println(1);
                return;
            }
        }

        System.out.println(0);

    }


}
