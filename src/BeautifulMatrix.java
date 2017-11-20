import java.util.Scanner;

/**
 * Created by Nabillionaire on 7/24/17.
 */
public class BeautifulMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0, j = 0;

        first:
        for (; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                if(sc.nextInt() == 1) break first;
            }
        }

        System.out.println(Math.abs(2 - i) + Math.abs(2 - j));
    }

}
