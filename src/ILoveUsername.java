import java.util.Scanner;

/**
 * Created by Nabillionaire on 7/28/17.
 */
public class ILoveUsername {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int first = sc.nextInt();
        int minVal = first;
        int maxVal = first;

        int count = 0;

        for(int i = 0; i < n - 1; i++){
            int cur = sc.nextInt();
            if(cur > maxVal || cur < minVal) ++count;
            minVal = Math.min(minVal, cur);
            maxVal = Math.max(maxVal, cur);
        }

        System.out.println(count);


    }

}
