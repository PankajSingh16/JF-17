import  java.util.Scanner;
public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of rectangle:");
        int l = sc.nextInt();
        System.out.println("Enter breadth of rectangle:");
        int b = sc.nextInt();
        System.out.println("Area of rectangle is = " + (l*b));
        System.out.println("Perimeter of rectangle is = " + (2*(l+b)));
    }
}
