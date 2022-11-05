import java.util.Scanner;
public class Powercls1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        /*
        //print upto natural number
        for (int i = 1;i<=n;i++){
            System.out.print(i + " ");
        }
        */
        /*
        // reverse of natueral number
        for (int i = n;i>=1;i--){
            System.out.print(i + " ");
        }

         */
        //table
        /*
        System.out.println("Table of number");
        for (int i = 1;i<=10;i++){
            System.out.println(n + "*" + i + "=" + (n*i));
        }

         */
        // print sum upto n natural terms
        /*
        int sum =0;
        for (int i = 1;i<=n;i++){
            sum+=i;
            System.out.print(sum + " "); // we are printing our output in same line thats why we are using (remove space + " ")
        }

         */
        /*
        //factorial of numbr
        int fact = 1;
        for (int i=1;i<=n;i++){
            fact = fact*i;
            System.out.print(fact + " ");
        }

         */
        //
        /*
        int sumO = 0;
        int sumE =0;
        for (int i =1;i<=n;i++){
            if (i % 2==0){
                sumE +=i;
            }
            else {
                sumO +=i;
            }

        }
        System.out.println("sum of even number "+ sumE);
        System.out.println("Sum of odd number "+ sumO);
    }

         */
        //while loop
        int i =1 ;
        int sum = 0;
        int rem ;
        while (n!=0){
           // System.out.print(i + " ");
            rem = n % 10;
            sum +=rem;
            n /=10;
            //System.out.print("remainder values are :" + rem +" " );
        }
            System.out.println("Sum of digit " + sum);
    }
}
