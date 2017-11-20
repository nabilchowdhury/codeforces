import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Nabillionaire on 7/25/17.
 */
public class IWannaBeTheGuy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int bitMask = (int)Math.pow(2, n) - 1;

        BigInteger bi = BigInteger.valueOf(bitMask);
        int p = sc.nextInt();
        for (int i = 0; i < p; i++) {
            bi = bi.clearBit(sc.nextInt() - 1);
        }

        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            bi = bi.clearBit(sc.nextInt() - 1);
        }

        System.out.println(bi.bitCount() == 0 ? "I become the guy." : "Oh, my keyboard!");

    }

}
