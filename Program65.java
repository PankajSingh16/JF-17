import  java.util.Scanner;
public class Program65 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=2*n;j++){

                if (i==j || j==2*n-i){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
