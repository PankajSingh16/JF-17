import java.util.Scanner;
public class Program42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        if (n % 1 == 0 && n % n ==0){
            System.out.println(n + " is prime number ");
        }
        else {
            System.out.println(n + " is not prime");
        }
        // 2nd method
        /*
        int c =0;
        for (int i =1;i<=n;i++){
            if (n%i==0){
                System.out.println(i);
                c++;
            }
        }
        System.out.println(c<=2?"Prime":"Not prime");

         */

    }
}
