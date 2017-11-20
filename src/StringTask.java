import java.util.Scanner;

/**
 * Created by Nabillionaire on 7/24/17.
 */
public class StringTask {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c >= 'A' && c <= 'Z') c += 'a' - 'A';
            if(!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y')) sb.append("."+c);
        }

        System.out.println(sb.toString());

    }

}
