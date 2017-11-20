import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by Nabillionaire on 11/8/17.
 */
public class Addepar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        ArrayList<String[]> list = new ArrayList<>();

        for (int i = 0; i < N; ++i) {
            String line = sc.nextLine();
            list.add(line.split(" "));
        }

        int key = sc.nextInt();
        boolean reversed = sc.next().equals("true");
        boolean numeric = sc.next().equals("numeric");

        Collections.sort(list, new Comparator<String[]>(){
            @Override
            public int compare(String[] s1, String[] s2) {
                if (numeric) {
                    Integer a = Integer.parseInt(s1[key - 1]);
                    Integer b = Integer.parseInt(s2[key - 1]);
                    return reversed ? -a.compareTo(b) : a.compareTo(b);
                } else {
                    String a = s1[key - 1];
                    String b = s2[key - 1];
                    return reversed ? -a.compareTo(b) : a.compareTo(b);
                }
            }
        });
    }

}
