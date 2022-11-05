import java.util.*;
public class Day16 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
       int n = sc.nextInt();
        /* for (int i = n;i>=0;i--){
            for (int j=i;j>=0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }

         */
        // 55
        /* int bill = 0;
        System.out.println("Press 1 for indian\nPress 2 for Chinese");
        int n = sc.nextInt();
        switch (n){
            case 1->{
                System.out.println("");
            }

         */
        // pattern question
        /*
        //first pattern
        for (int i = 1;i<=5;i++){
            System.out.print("* ");
        }

         */
        /*
        //2 pattern
        for (int i = 1;i<=n;i++){
            for (int j =1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

         */
         //3 pattern
        /*
        for (int i = 1;i<=n;i++){
            for (int j =1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

         */
        for (int  j =1;j<=n;j++){
            for (int i=1;i<=n-j+1;i++){
                System.out.println("* ");
            }
            System.out.println();
        }
    }

}
