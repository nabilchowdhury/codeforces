import java.util.Scanner;

/**
 * Created by Nabillionaire on 7/25/17.
 */
public class QueueAtTheSchool {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), t = sc.nextInt();
        String s = sc.next();

        char[] queue = s.toCharArray();

        for (int i = 0; i < t; i++) {
            for (int j = 1; j < queue.length; j++) {
                if(queue[j] == 'G' && queue[j - 1] == 'B') {
                    queue[j] = 'B';
                    queue[j - 1] = 'G';
                    j++;
                }
            }
        }

        System.out.println(new String(queue));

    }

}
