//import java.lang.String; ye invisible hota hai
// lang package is imported by java by default
import java.util.Scanner;// scanner ki jagah * likhne par sari api aa jayegi package se e.g import java.util.*;
public class Day4 {
    public static void main(String[] args) {
        /* one / back slash give information
        that the next character is threat as normal



        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first num");
        int a = sc.nextInt();
        System.out.println("Enter second num");
        int b = sc.nextInt();
        System.out.println("Sum is " + ( + a + b));

       Scanner sc1 = new Scanner(System.in);
        char labrador = sc1.next().charAt(0);
        System.out.println(labrador);


 */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Your Age: ");
        int age = sc.nextInt();
        System.out.println("Hello " + name + ",You are " + age + " years old.");




    }
}
