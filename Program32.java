import java.util.*;
public class Program32 {
    public static void main(String[] args) {
        System.out.println("Maths Table");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for which table you want");
        int n = sc.nextInt();
        //int i;
        for (int i=1;i<=10;i++){
            System.out.println( n + "*" + i + "=" + (n*i));
        }
    }
}
