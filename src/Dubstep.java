import java.util.Scanner;

/**
 * Created by Nabillionaire on 7/25/17.
 */
public class Dubstep {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String song = sc.next();
        String[] parts = song.split("WUB");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < parts.length; i++) {
            sb.append(' ');
            sb.append(parts[i]);
        }

        System.out.println(sb.toString().trim());
    }

}
