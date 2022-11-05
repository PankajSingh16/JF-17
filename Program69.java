import java.util.Scanner;

public class Program69 {
    //ind the LCM of two numbers
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = Math.max(a,b);
        for (int i = ans;i<=a*b;i+=ans){
            if (ans%a==0 && ans%b==0){
               // System.out.println(ans);
            ans = i;
            }
        }
        System.out.println(ans);
    }
}
