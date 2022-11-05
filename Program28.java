import java.util.*;
public class Program28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a = ");
        double a = sc.nextDouble();
        System.out.println("Enter value of b = ");
        double b = sc.nextDouble();
        double t = a;
        a = b;
        System.out.println("a = " + a);
        b=t;
        System.out.println("b = "+ b);


    }
}
