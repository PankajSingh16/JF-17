import java.util.*;
public class Program34 {
    public static void main(String[] args) {
        System.out.println("Factorial of a number ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int fact = 1;
        int i;
        for (i = 1;i<=n;i++){
            fact *=i;
            System.out.println(fact);
        }
        System.out.println("Falsy value of i is " + i );
    }
}
