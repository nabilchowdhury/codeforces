import java.util.Scanner;

/**
 * Created by Nabillionaire on 7/28/17.
 */
public class ChoosingTeams {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int count = 0;
        for(int i = 0; i < n; i++) count += 5 - sc.nextInt() >= k ? 1 : 0;
        System.out.println(count / 3);
    }

}
