import java.util.Scanner;

/**
 * Created by Nabillionaire on 7/25/17.
 */
public class YoungPhysicist {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = 0, y = 0, z = 0;

        for (int i = 0; i < n; i++) {
            x += sc.nextInt();
            y += sc.nextInt();
            z += sc.nextInt();
        }

        System.out.println((x == 0 && y == 0 && z == 0) ? "YES" : "NO");

    }

}
