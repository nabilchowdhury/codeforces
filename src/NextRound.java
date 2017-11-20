import java.util.Scanner;

/**
 * Created by Nabillionaire on 7/24/17.
 */
public class NextRound {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int score = Integer.MIN_VALUE;
        int count = 0;
        for(int i = 0; i < n; i++){
            int cur = sc.nextInt();
            if(cur > 0 && cur >= score) count++;
            if(i + 1 == k) score = cur;
        }

        System.out.println(count);
    }

}
