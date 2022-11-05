import java.util.Scanner;
public class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks out of 100.");
        System.out.println("Maths = ");
        int m = sc.nextInt();
        System.out.println("Computer = ");
        int c = sc.nextInt();
        System.out.println("English = ");
        int e=sc.nextInt();
        int total = m + c + e ;
        double percent = ((m + c + e)*100)/300;
        System.out.println("Total marks = " + total);
        System.out.println("Percentage = " + percent + " %");


    }
}
