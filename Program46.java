import java.util.*;
public class Program46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        int rem =0;
        int fsum = 0;
        int temp = n;
        while (n!=0){
            int dfact =1;
            rem = n % 10;
            for (int i = 1;i<=rem;i++){
                dfact = dfact*i;
            }
            fsum = fsum + dfact;
            n = n/10;

        }
        System.out.println("Sum : " + fsum);
        System.out.println(fsum == temp?"Strong":"Not Strong");
    }
}
