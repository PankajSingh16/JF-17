import java.util.*;
public class Program24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter units:");
        int units= sc.nextInt();
        double amt = 0;
        if (units>0  && units<=100 ){
            amt = units*4.2;
            System.out.println("Total bill amount = " + amt);
        } else if (units >=101 && units <=200) {
            amt = (units - 100)*6;
            System.out.println("Total bill amount is " + (amt + (100*4.2)));
        } else if (units >= 201 && units<400) {
            amt = (units - 200)*8;
            System.out.println("Total bill amount is " + (amt + (100*6 + 100*4.2)));
        } else if (units >=400) {
            amt = (units - 400)*13;
            System.out.println("Total bill amount is " + (amt + 200*8 + 100*6 + 100*4.2));
        }
        else {
            System.out.println("invalid input");
        }
        //double total_bill = units*amt;
        //System.out.println("Total bill amount is "+ total_bill);
    }
}
