import  java.util.*;
public class Program36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        int div3 = 0;
        int div5 = 0;
        int i;
        for (i= 1;i<=n;i++){
            if (i % 3 == 0){
                div3 += i;
            } else if (i % 5 == 0) {
                div5 += i;
            }

        }
        System.out.println("Sum of number divisible by 3 is " + div3);
        System.out.println("Sum of number divisible by 5 is " + div5);
    }
}
