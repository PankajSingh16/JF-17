import java.util.Scanner;
public class Day11 {
    public static void main(String[] args) {
        int n= 10;
       /* for (int i = 1; i<=n;i= i-2){
            System.out.println(i);
        }

        */
        /*
        for (int i = 1; i<=n;i= i / 10){
            System.out.println(i);
        }
        */
        /* reverse loop
        for (int i = n; i>=1;i= i /10) {
            System.out.println(i);
        }
        System.out.println("falsy value of i" + i );

         */
        //table
        for (int i = 1; i<=10;i++) {
            System.out.println(n + "*" + i + "=" + (n*i));
        }
    }
}
