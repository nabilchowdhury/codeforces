import java.util.Scanner;
import java.util.HashSet;

/**
 * Created by Nabillionaire on 7/26/17.
 */
public class AntonAndLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        HashSet<Character> hs = new HashSet<>();
        int res = 0;

        for (int i = 1; i < s.length() - 1; i += 3) {
            if (!hs.contains(s.charAt(i))) {
                res++;
                hs.add(s.charAt(i));
            }
        }

        System.out.println(res);

    }
}
