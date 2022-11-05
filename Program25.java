import java.util.Scanner;
import java.math.MathContext;
public class Program25 {
    public static void main(String[] args) {
        int r2000=0,r500=0,r100=0,r200=0,r50=0,r20=0,r10=0,r5=0,r1=0;
        System.out.println("INR Denomination");
        Scanner sc = new Scanner(System.in);
        int amt = sc.nextInt();
        if (amt>=2000 || amt < 2000){
            r2000 = amt/2000;
            amt = amt %2000;
            System.out.println("Number of 2000 notes = " + r2000);
            r500 = amt / 500;
            amt = amt % 500;
            System.out.println("Number of 500 notes = " + r500);
            r200 = amt / 200;
            amt = amt % 200;
            System.out.println("Number of 200 notes = " + r200);
            r100 = amt / 100;
            amt = amt % 100;
            System.out.println("Number of 100 notes = " + r100);
            r50 = amt / 50;
            amt = amt % 50;
            System.out.println("Number of 50 notes = " + r50);
            r20 = amt / 20;
            amt = amt % 20;
            System.out.println("Number of 20 notes = " + r20);
            r10 = amt / 10;
            amt = amt % 10;
            System.out.println("Number of 10 notes = " + r10);
            r5 = amt / 5;
            amt = amt % 5;
            System.out.println("Number of 5 notes = " + r5);
            int r2 = amt / 2;
            amt = amt % 2;
            System.out.println("Number of 2 notes = " + r2);
            r1 = amt / 1;
            System.out.println("Number of 1 notes = " + r1);
        }
        /* else if (amt<2000) {
            r500 = amt / 500;
            amt = amt % 500;
            System.out.println("Number of 500 notes = " + r500);
            r200 = amt / 200;
            amt = amt % 200;
            System.out.println("Number of 200 notes = " + r200);
            r100 = amt / 100;
            amt = amt % 100;
            System.out.println("Number of 100 notes = " + r100);
            r50 = amt / 50;
            amt = amt % 50;
            System.out.println("Number of 50 notes = " + r50);
            r20 = amt / 20;
            amt = amt % 20;
            System.out.println("Number of 20 notes = " + r20);
            r10 = amt / 10;
            amt = amt % 10;
            System.out.println("Number of 10 notes = " + r10);
            r5 = amt / 5;
            amt = amt % 5;
            System.out.println("Number of 5 notes = " + r5);
            int r2 = amt / 2;
            amt = amt % 2;
            System.out.println("Number of 2 notes = " + r2);
            r1 = amt / 1;
            System.out.println("Number of 1 notes = " + r1);

        }
        */
        else {
            System.out.println("invalid input");
        }


    }


}
