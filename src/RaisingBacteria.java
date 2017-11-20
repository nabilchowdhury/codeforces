import java.util.Scanner;

/**
 * Created by Nabillionaire on 9/8/17.
 */
public class RaisingBacteria {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int desired = sc.nextInt();

        int count = 0;

        while(desired > 0) {
            if (desired % 2 == 1) count++;
            desired /= 2;
        }

        System.out.println(count);
    }

}
