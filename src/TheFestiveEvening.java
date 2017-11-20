import java.util.Scanner;

/**
 * Created by Nabillionaire on 7/30/17.
 */
public class TheFestiveEvening {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        String s = sc.next();

        boolean[] finished = new boolean[n];
        char first = s.charAt(0);
        int count = 1;
        for(int i = 1; i < s.length(); i++){

            char cur = s.charAt(i);
            if(first != cur) {
                finished[first - 'A'] = true;
                if(finished[cur - 'A']) {
                    count++;
                    finished[cur - 'A'] = false;
                }
            }

            first = cur;
        }

        System.out.println(count <= k ? "NO" : "YES");
    }

}
