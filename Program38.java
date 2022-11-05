import java.util.*;
public class Program38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find its factors");
        int n = sc.nextInt();
        int i;
        int fac_sum = 0;
        System.out.println("Factors of " + n + " are");
        for (i=1;i<=n;i++){
            if (n % i == 0){
                System.out.println(i);
            fac_sum +=i;
            }
            //fac_sum +=i;
        }
        System.out.println("Sum of all factors of " + n + " is " + fac_sum);
        System.out.println("Falsy value of i is " + i);
    }
}
