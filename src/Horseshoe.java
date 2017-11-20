import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by Nabillionaire on 7/26/17.
 */
public class Horseshoe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s1 = sc.nextInt(), s2 = sc.nextInt(), s3 = sc.nextInt(), s4 = sc.nextInt();

        HashSet<Integer> set = new HashSet();
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);

        System.out.println(4 - set.size());

    }

}
