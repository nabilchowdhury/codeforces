import java.util.Scanner;

/**
 * Created by Nabillionaire on 7/26/17.
 */
public class IQTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int countOdd = 0, countEven = 0;
        int oddIndex = -1, evenIndex = -1;

        for(int i = 0; i < n; i++) {
            int cur = sc.nextInt();

            if(cur % 2 == 0) {
                countEven++;
                evenIndex = i+1;
            } else {
                countOdd++;
                oddIndex = i+1;
            }

            if(countEven > 1 && countOdd == 1) {
                System.out.println(oddIndex);
                return;
            }else if(countOdd > 1 && countEven == 1) {
                System.out.println(evenIndex);
                return;
            }

        }

    }

}
