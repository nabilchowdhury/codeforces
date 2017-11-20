import com.sun.tools.javac.util.ArrayUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Nabillionaire on 8/7/17.
 */
public class GivenLengthAndSumOfDigits {

    static char[] reverse (char[] c) {
        for (int i = 0; i < c.length / 2; i++) {
            char t = c[i];
            c[i] = c[c.length - 1 - i];
            c[c.length - 1 - i] = t;
        }
        return c;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), s = sc.nextInt();

        char[] number = new char[m];
        Arrays.fill(number, '0');
        number[0] = '1';

        int req = s - 1;
        int i = number.length - 1;
        while (req > 0 && i >= 0) {
            if (req >= 9) {
                int n = 9 - (number[i] - '0');
                number[i] += n;
                req -= n;
            } else {
                number[i] += req;
                req = 0;
            }
            i--;
        }

//        System.out.println(req > 0 ||  ? "-1 -1" : new String(number) + " " + new String(reverse(number)));

    }

}
