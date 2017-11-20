import java.util.Scanner;

/**
 * Created by Nabillionaire on 7/24/17.
 */
public class Team {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int res = 0;

        for(int i = 0; i < n; i++) {
            boolean a = sc.nextInt() == 1 ? true : false, b = sc.nextInt() == 1 ? true : false, c = sc.nextInt() == 1 ? true : false;
            if(a && b || a && c || b && c) res++;
        }

        System.out.println(res);

    }
}
