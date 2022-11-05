import java.util.*;
public class Program50 {
    //Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers
    //from a list of numbers (N) entered by the user.
    //The list terminates when the user enters a zero.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculator");
        char in ;
        do {
        System.out.println("Enter 1 to add \nEnter 2 to subtract \nEnter 3 to multiply");
             int ch = sc.nextInt();
            if (ch == 1){
                //System.out.println("Enter 1 to add");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println(a+b);
            } else if (ch == 2) {
                //System.out.println("Enter 2 to subtract");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println(a-b);
            } else if (ch == 3) {
                //System.out.println("Enter 3 to multiply");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println(a*b);
            } /*else if (ch == 4) {
                //System.out.println("Enter 4 to divide");
                int a = sc.nextInt();
                int b = sc.nextInt();
                double divide = a%b;
                System.out.println(divide);
            }
            */
            else {
                System.out.println("Please enter valid input");
            }
            System.out.println("Press Y to repeat");
         in = sc.next().charAt(0);
        }
        while (in == 'Y' || in == 'y' );
    }
}
