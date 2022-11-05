import java.util.*;
public class Program17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lenght of first side = ");
        double a = sc.nextDouble();
        System.out.println("Enter lenght of second side = ");
        double b= sc.nextDouble();
        System.out.println("Enter lenght of third side = ");
        double c = sc.nextDouble();
        double s = (a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of triangle is = " + area);
    }
}
