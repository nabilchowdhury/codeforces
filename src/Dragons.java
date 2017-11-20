import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by Nabillionaire on 7/27/17.
 */
public class Dragons {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt(), n = sc.nextInt();
        int[][] dragons = new int[n][2];

        for (int i = 0; i < n; i++) {
            dragons[i][0] = sc.nextInt();
            dragons[i][1] = sc.nextInt();
        }

        Arrays.sort(dragons, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        for (int i = 0; i < n; i++) {
            if(s > dragons[i][0]) {
                s += dragons[i][1];
            } else {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");

    }

}
