import java.util.Scanner;
public class Program45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        int temp = n;
        int rem;
        int sum=0;
        while (n != 0){
            rem = n % 10;
            sum = sum + rem*rem*rem;
            n = n/10;
        }
        //System.out.println(sum);
        if (sum == temp){
            System.out.println("Armstrong number ");
        }
        else {
            System.out.println("Not Armstrong number");
        }
    }
}
