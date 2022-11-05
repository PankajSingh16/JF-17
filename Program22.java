import java.util.*;
public class Program22 {
    public static void main(String[] args) {
        System.out.println("Enter marks out of 100");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks = ");
        int marks = sc.nextInt();
        if (marks > 90 && marks<=100){
            System.out.println("AA grade");
        } else if (marks <= 90 && marks> 80) {
            System.out.println("AB grade");
        } else if (marks <= 80 && marks>70) {
            System.out.println("BB garde");
        } else if (marks<=70 && marks>60) {
            System.out.println("BC grade");
        } else if (marks<= 60 && marks>50) {
            System.out.println("CD grade");
        } else if (marks <= 50 && marks>40) {
            System.out.println("DD grade");
        }
        else {
            System.out.println("F grade");
        }
    }
}
