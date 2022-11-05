import java.util.*;
public class Program35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        int sumE = 0;
        int sumO = 0;
        int i;
        for (i =1;i<=n;i++){
            if (i % 2 == 0){
                sumE+=i;
              //  System.out.println(sumE); / ye yaha nhi likhega
            }
            else {
                sumO +=i;
              //  System.out.println(sumO); /yaha nhi likhege yaha
            }

        }
        System.out.println("Sum of even number is " + sumE);
        System.out.println("Sum of odd number is " + sumO);
        System.out.println("falsy value of i is " + i );
    }
}
