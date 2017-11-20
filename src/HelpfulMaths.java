import java.util.Scanner;

/**
 * Created by Nabillionaire on 7/24/17.
 */
public class HelpfulMaths {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int count1 = 0, count2 = 0, count3 = 0;

        for(int i = 0; i < s.length(); i += 2) {
            if (s.charAt(i) == '1') ++count1;
            else if (s.charAt(i) == '2') ++count2;
            else ++count3;
        }

        StringBuilder sb = new StringBuilder(s.length());
        for(int i = 0; i < count1; i++) {
            sb.append(1);
            sb.append('+');
        }
        for(int i = 0; i < count2; i++) {
            sb.append(2);
            sb.append('+');
        }
        for(int i = 0; i < count3; i++) {
            sb.append(3);
            sb.append('+');
        }

        sb.setLength(sb.length() - 1);
        System.out.println(sb.toString());

    }

}
