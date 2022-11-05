import java.util.Scanner;
import java.math.MathContext;
public class Program16 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principle amount = ");
        double p = sc.nextDouble();
        System.out.println("Enter the interest rate = ");
        double r = sc.nextDouble();
        System.out.println("Enter the time period (in years) =");
        int t = sc.nextInt();
        double CI = p * Math.pow(1+ (r/100),t);
        System.out.println("Compound Interest is = " + CI);

    }
}
