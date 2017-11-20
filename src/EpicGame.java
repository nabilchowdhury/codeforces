import java.util.Scanner;

/**
 * Created by Nabillionaire on 7/26/17.
 */
public class EpicGame {

    static int gcd(int minVal, int maxVal) {

        if(maxVal == minVal)
            return maxVal;

        maxVal -= minVal;
        return gcd(minVal < maxVal ? minVal:maxVal, minVal < maxVal ? maxVal:minVal);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt(), n = sc.nextInt();

        boolean simon = true;

        while(n > 0){

            if (simon) {
                n -= gcd(Math.min(a, n), Math.max(a, n));
            } else {
                n -= gcd(Math.min(b, n), Math.max(b, n));
            }

            simon = !simon;

        }

        System.out.println(simon == true ? "1" : "0");

    }

}
