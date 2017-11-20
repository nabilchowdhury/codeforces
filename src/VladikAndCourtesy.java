import java.util.Scanner;

/**
 * Created by Nabillionaire on 7/30/17.
 */
public class VladikAndCourtesy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt(), b = sc.nextInt();

        int n1 = (int)Math.sqrt((double)a);
        int n2 = (int)((-1 + Math.sqrt(1 + 4 * b)) / 2);

        System.out.println(n1 > n2 ? "Valera" : "Vladik");
    }

}
