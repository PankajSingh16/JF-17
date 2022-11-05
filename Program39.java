import java.util.*;
public class Program39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        int i;
        int fsum=0;
        System.out.println("Factors of " + n + " is :");
        for (i= 1; i<=n;i++){
            if (n % i == 0 ){
                fsum +=i;
                System.out.println(i);
            }


        }
        System.out.println("Sum of all factors of " + n + " is "+ fsum);
        if (fsum - 2*n == 0){
            System.out.println(n + " number is perfect number");
        }
        else {
            System.out.println(n + " not perfect number");
        }

    }
}
