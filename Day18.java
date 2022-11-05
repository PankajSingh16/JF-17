import java.util.Scanner;
public class Day18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = Math.min(a,b);
        /* for (int i = ans;i>=1;i--){
            if (a%i==0 && b %i ==0){
                ans = 1;
                break;
            }
        }

         */
        System.out.println(ans);
        while (ans >=1){
            if (a%ans==0 && b %ans ==0) {
                break;
            }
                else
                ans--;


        }

    }
}
