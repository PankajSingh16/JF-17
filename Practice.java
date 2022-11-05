import java.util.*;
public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int c = 0;
        int temp = n;
        int sq = n*n;
        while (n!=0){
            c++;
            n = n/10;
        }
        int lastdigit = sq % (int)Math.pow(10,c);
        System.out.println(lastdigit == temp ? "Auto":"Not auto" );
    }
}
