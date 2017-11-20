import java.util.Scanner;

/**
 * Created by Nabillionaire on 7/25/17.
 */
public class GeorgeAndAccommodation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int res = 0;

        for(int i = 0; i < n; i++){
            if(-(sc.nextInt() - sc.nextInt()) >= 2) res++;
        }

        System.out.println(res);

    }

}
