import java.util.Scanner;

/**
 * Created by Nabillionaire on 7/25/17.
 */
public class GameWithSticks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m = sc.nextInt();

        System.out.println((n * m) % 2 == 0 && n != 1 && m != 1 ? "Malvika" : "Akshat");
    }

}
