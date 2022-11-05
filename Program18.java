import java.util.*;
import java.util.Scanner;

public class Program18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a = ");
        int a = sc.nextInt();
        System.out.println("Enter b = ");
        int b = sc.nextInt();
        System.out.println("Enter c = ");
        int c = sc.nextInt();
        double roots1 = ((-b) + Math.sqrt(b*b - 4*a*c))/(2*a*c);
        double roots2 = ((-b) + Math.sqrt(b*b + 4*a*c))/(2*a*c);
        System.out.println("Quadratic quation is = " + a +"x^2 + " + b +"x + " + c);
        System.out.println("roots are " + roots1 + " & "+ roots2);


    }
}
