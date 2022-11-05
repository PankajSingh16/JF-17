import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Principle = ");
        int P = sc.nextInt();
        System.out.println("Time(in years) = ");
        int T = sc.nextInt();
        System.out.println("Rate of Interest = ");
        int R = sc.nextInt();
        double SI = (P*R*T)/100;
        System.out.println("Simple Interest = " + SI);
    }
}
