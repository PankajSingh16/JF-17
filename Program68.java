import  java.util.Scanner;
public class Program68 {
    //Take 2 numbers as inputs and find their HCF.
    public static void main(String[] args) {
        int a =18,b=4;
        int ans = Math.min(a,b);
        for (int i = ans;i>=1;i--){
            if (a%i==0 && b %i ==0){
                ans = i;
                break;
            }
        }
        System.out.println(ans);

    }
}
