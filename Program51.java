import java.util.*;
public class Program51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int sumN= 0;
        int sumPE = 0;
        int sumPO = 0;
            System.out.println("Enter the number");
        do {
             n = sc.nextInt();
            if ( n < 0)
                sumN += n;

            else if ( n > 0 && n % 2==0)
                sumPE+= n;

            else
                sumPO += n;

        }
        while (n!=0);
            System.out.println("Sum of negative number is " + sumN);
            System.out.println("Sum of positive even number is " + sumPE);
            System.out.println("Sum of positive odd number is " + sumPO);
    }
}
