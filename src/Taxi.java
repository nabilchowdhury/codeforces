import java.util.Scanner;

/**
 * Created by Nabillionaire on 7/24/17.
 */
public class Taxi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int one = 0, two = 0, three = 0, four = 0;

        for(int i = 0; i < n; i++) {
            int cur = sc.nextInt();
            switch (cur) {
                case 1 : ++one;
                break;

                case 2 : ++two;
                break;

                case 3 : ++three;
                break;

                default : ++four;
                break;
            }
        }

        int count = four;

        count += Math.min(three, one);
        three -= count - four;
        one -= count - four;

        count += one / 4;
        one %= 4;

        count += three;
        three = 0;

        count += two / 2;
        two %= 2;

        count += (int)Math.ceil((one + two * 2) / 4.0);

        System.out.println(count);

    }

}
