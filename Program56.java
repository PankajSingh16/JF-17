import java.util.*;
public class Program56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height of Traingle");
        int h = sc.nextInt();
        for (int i = 0;i<=h;i++){
            for (int j = 0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
