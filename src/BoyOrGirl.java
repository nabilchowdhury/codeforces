import java.util.Scanner;
import java.util.HashSet;

/**
 * Created by Nabillionaire on 7/25/17.
 */
public class BoyOrGirl {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        HashSet<Integer> set = new HashSet();
        for(int i = 0; i < s.length(); i++) set.add((int)s.charAt(i));

        System.out.println(set.size() % 2 == 0 ? "CHAT WITH HER!" : "IGNORE HIM!");

    }

}
