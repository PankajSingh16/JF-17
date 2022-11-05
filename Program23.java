import java.util.*;
public class Program23
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount:");
        int amt = sc.nextInt();
        double percent=0;
        if (amt >=0 && amt<= 5000){
            percent=0;
        } else if (amt <=7000 && amt>5000) {
            percent=10;
        } else if (amt>7000 && amt<=10000) {
            percent=20;
        } else if (amt >10000) {
            percent=30;
        }
        else {
            System.out.println("invalid input");
        }
        double total = amt - (amt*percent)/100;
        System.out.println("your total payable bill amount is = " + total);
    }
}
