import java.util.Scanner;

/**
 * Created by Nabillionaire on 7/25/17.
 */
public class DoubleCola {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int res = 0;

        if (x <= 5) {
            res = x;
        } else {

            int power = (int)(Math.log((x + 5) / 10.0) / Math.log(2.0));
            long totalUpTo = 5 * (long)(Math.pow(2, power + 1) - 1);
            long lastRow = 5 * (long) Math.pow(2, power + 1);
            res = (int)Math.ceil( (x - totalUpTo) / (double)(lastRow / 5) );

        }

        switch (res) {
            case 1 : System.out.println("Sheldon");
            break;

            case 2 : System.out.println("Leonard");
            break;

            case 3 : System.out.println("Penny");
            break;

            case 4 : System.out.println("Rajesh");
            break;

            default : System.out.println("Howard");
            break;
        }

    }

}
