import java.util.Scanner;

/**
 * Created by Nabillionaire on 7/24/17.
 */
public class ChatRoom {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String h = "hello";
        String s = sc.next();

        int hIndex = 0;

        for(int i = 0; i < s.length() && hIndex < h.length(); i++){
            if(h.charAt(hIndex) == s.charAt(i)) hIndex++;
        }

        System.out.println(hIndex == h.length() ? "YES" : "NO");

    }

}
