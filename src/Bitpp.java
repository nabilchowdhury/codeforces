import java.util.Scanner;

/**
 * Created by Nabillionaire on 7/24/17.
 */
public class Bitpp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int res = 0;

        for(int i = 0; i < n; i++) {
           String s = sc.next();
           if(s.charAt(0) == '+' || s.charAt(2) == '+') ++res;
           else --res;
        }

        System.out.println(res);

    }

}
