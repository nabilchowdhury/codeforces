import java.util.Scanner;

/**
 * Created by Nabillionaire on 7/25/17.
 */
public class LuckyDivision {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i = 1;
        for (; i <= n; i++) {
            if(checkIfBeautiful(i) && n % i == 0) break;
        }

        System.out.println(i > n ? "NO" : "YES");

    }

    static boolean checkIfBeautiful(int n){
        while (n > 0) {
            if(n % 10 != 4 && n % 10 != 7) return false;
            n /= 10;
        }
        return true;
    }

}
