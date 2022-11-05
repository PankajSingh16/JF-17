import java.util.*;
public class Program21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year to check :");
        int year = sc.nextInt();
        if (year % 100 == 0){
            if (year % 400 == 0){
                System.out.println("Enter year is leap year.");
            }
            else {
                System.out.println("Not leap year.");
            }
        } else if (year % 4 == 0) {
            System.out.println("Enter year is leap year");
        }
        else {
            System.out.println("Not leap");
        }
    }
}
