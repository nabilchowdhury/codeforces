import java.util.Scanner;

/**
 * Created by Nabillionaire on 7/24/17.
 */
public class WayTooLongWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            String s = sc.next();
            System.out.println(s.length() > 10 ? s.charAt(0)+""+(s.length() - 2)+""+s.charAt(s.length() - 1) : s);
        }
    }

}
