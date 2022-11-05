import java.util.Scanner;
public class Program7 {
    public static void main(String[] args) {
        System.out.println("Enter marks out of 100");
        Scanner sc = new Scanner(System.in);
        System.out.println("Maths = ");
        float math = sc.nextFloat();
        System.out.println("English = ");
        float eng = sc.nextFloat();
        System.out.println("Computer = ");
        float comp = sc.nextFloat();
        float total = math + eng + comp;
        float percent = (total * 100)/300;
        System.out.println("Total marks = " + total);
        System.out.println("Obtained Percentage = " + percent + "%");

    }
}