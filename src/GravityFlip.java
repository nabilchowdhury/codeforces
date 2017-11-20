import java.util.Scanner;
import java.util.Arrays;
/**
 * Created by Nabillionaire on 7/26/17.
 */
public class GravityFlip {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[101];

        for(int i = 0; i < n; i++){
            arr[sc.nextInt()]++;
        }

        for(int i = 1; i < arr.length; i++){
            for(int c = 0; c < arr[i]; c++){
                if(i != 1 || c != 0)
                    System.out.print(' ');
                System.out.print(i);
            }
        }
    }

}
