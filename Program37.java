import java.util.*;
public class Program37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find its factors");
        int n = sc.nextInt();
        int i;
        System.out.println("Factors of " + n + " are");
        for (i=1;i<=n;i++){
            if (n % i == 0){

                System.out.println(i);
            }
        }
    }
}
