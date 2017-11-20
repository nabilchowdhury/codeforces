import java.util.Scanner;

/**
 * Created by Nabillionaire on 7/28/17.
 */
public class BuyAShovel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(), r = sc.nextInt();

        int i = 1;

        for(; i <= 10; i++){
            int c = (k * i) % 10;
            if(c == r || c == 0) break;
        }

        System.out.println(i);

    }

}
