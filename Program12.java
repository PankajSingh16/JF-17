import java.util.Scanner;
public class Program12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter gender In M/F");
        char gender = sc.next().charAt(0);
        if (gender == 'M' ){
            System.out.println("Good morning sir.");
        }
        else {
            System.out.println("Good morning mam.");
        }
    }
}
