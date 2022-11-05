import java.util.*;
public class Program28_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a = ");
        double a = sc.nextDouble();
        System.out.println("Enter value of b = ");
        double b = sc.nextDouble();
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
