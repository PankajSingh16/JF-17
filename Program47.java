import java.util.*;
public class Program47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int temp = n;
        int rem;
        int sum = 0;
        while (n!=0){
            rem = n %10;
            sum =  sum +rem;
            n = n/10;
        }
        if (temp % sum ==0 ){
            System.out.println("Harshad number");
        }
        else {
            System.out.println("not Harshad number");
        }
        //System.out.println(sum);
    }
}
