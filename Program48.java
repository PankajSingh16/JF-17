import java.util.*;
public class Program48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        int sq =n*n;
        int c= 0;
        int temp = n;
        while (n!=0){
            c++;
            n = n/ 10;
            //System.out.println(n);
        }
        int lastdigits = sq % (int) Math.pow(10,c);
        System.out.println(lastdigits == temp ? "auto" : "not auto");
    }
}
