import java.util.Scanner;

/**
 * Created by Nabillionaire on 7/30/17.
 */
public class VladikAndFlights {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), a = sc.nextInt() - 1, b = sc.nextInt() - 1;
        String s = sc.next();

        if (s.charAt(a) == s.charAt(b)) {
            System.out.println(0);
        } else {
            int leftA = a - 1, rightA = a + 1;
            int leftB = b - 1, rightB = b + 1;
            while(leftA >= 0 && s.charAt(leftA) == s.charAt(a)) leftA--;
            while(rightA < n && s.charAt(rightA) == s.charAt(a)) rightA++;
            while(leftB >= 0 && s.charAt(leftB) == s.charAt(b)) leftB--;
            while(rightB < n && s.charAt(rightB) == s.charAt(b)) rightB++;

            leftA = leftA < 0 ? Integer.MAX_VALUE : leftA;
            rightA = rightA >= n ? Integer.MIN_VALUE : rightA;
            leftB = leftB < 0 ? Integer.MAX_VALUE : leftB;
            rightB = rightB >= n ? Integer.MIN_VALUE : rightB;

            int minDistFirst = Math.min(a - leftA, rightA - a);
            int minDistSecond = Math.min(b - leftB, rightB - b);

            System.out.println(Math.min(minDistFirst, minDistSecond));
        }

    }

}
