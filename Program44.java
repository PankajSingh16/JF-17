import java.util.Scanner;
public class Program44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        int rem = 0;
        int rev = 0;
        while (n != 0){
          int  res = n % 10;
            rev = rev*10 + rem;
            n = n/10;

        }
        if (rev == n) {
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrone");
        }

        }
}
