import java.util.Scanner;

/**
 * Created by Nabillionaire on 7/25/17.
 */
public class Presents {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[sc.nextInt() - 1] = i + 1;
        }

        for (int i = 0; i < n; i++) {
            if(i > 0)
                System.out.print(" ");
            System.out.print(arr[i]);
        }
        System.out.println();
    }

}
