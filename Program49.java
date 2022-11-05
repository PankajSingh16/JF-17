import java.util.*;
public class Program49 {
    //Print hello until user gives wrong input using do while
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character :");
        char in;
        do {
            System.out.println("Hello World!");
            System.out.println("Enter Y to repeat");
            in = sc.nextLine().charAt(0);
        }
        while (in == 'Y');

    }
}
