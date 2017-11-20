import java.util.Scanner;

/**
 * Created by Nabillionaire on 7/28/17.
 */
public class InitialBet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i = 0; i < 5; i++) sum += sc.nextInt();

        System.out.println(sum % 5 == 0 ? sum / 5 : -1);

    }

}
