import java.util.Scanner;
public class Program13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your gender in M/F");
        char gender = sc.nextLine().charAt(0);
        if (gender == 'M' || gender == 'm'){
            System.out.println("Good morning mam.");
        }
        else if (gender == 'F' || gender == 'f') {
            System.out.println("Good morning mam.");
        }
        else {
            System.out.println("invalid input");

        }
    }
}
