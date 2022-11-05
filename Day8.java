import java.util.Scanner;
public class Day8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter gender in M/F");
        char gender = sc.nextLine().charAt(0);
        if (gender == 'M'|| gender== 'm'){
            System.out.println("Good Morning Sir");

        }
        else if (gender == 'F'|| gender=='f'){
            System.out.println("Good morning mam");
        }
        else {
            System.out.println("Invalid input");
        }
    }

}
