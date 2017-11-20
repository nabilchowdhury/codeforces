import java.util.Scanner;

/**
 * Created by Nabillionaire on 7/30/17.
 */
public class TheUselessToy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c1 = sc.next().charAt(0), c2 = sc.next().charAt(0);
        int time = sc.nextInt();

        time %= 4;

        if(time == 0) {
            System.out.println();
        } if(c1 == '^' && c2 == 'v' || c1 == '<' && c2 == '>'){
            System.out.println("undefined");
        } else{

            if(c1 == '^') {
                if(c2 == '>'){
                    System.out.println(time == 1 ? "cw" : "ccw");
                } else if(c2 == '<') {
                    System.out.println(time == 1 ? "ccw" : "cw");
                }
            } else if(c1 == '>') {
                if(c2 == '^'){
                    System.out.println(time == 1 ? "ccw" : "cw");
                } else if(c2 == 'v') {
                    System.out.println(time == 1 ? "cw" : "ccw");
                }
            } else if(c1 == 'v') {
                if(c2 == '>'){
                    System.out.println(time == 1 ? "ccw" : "cw");
                } else if(c2 == '<') {
                    System.out.println(time == 1 ? "cw" : "ccw");
                }
            } else if(c1 == '<') {
                if(c2 == 'v'){
                    System.out.println(time == 1 ? "ccw" : "cw");
                } else if(c2 == '^') {
                    System.out.println(time == 1 ? "cw" : "ccw");
                }
            }

        }

    }

}
