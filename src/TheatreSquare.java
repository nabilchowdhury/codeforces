/**
 * Created by Nabillionaire on 7/24/17.
 */

import java.util.Scanner;

public class TheatreSquare {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();
        double m = sc.nextDouble();
        double a = sc.nextDouble();

        System.out.println((long)(Math.ceil(n/a) * Math.ceil(m/a)));

    }

}
