import java.util.*;
public class Program54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 to add \nPress 2 to sub\nPress 3 to multiply\nPress 4 to Divide");
        int n = sc.nextInt();
        switch (n){
            case 1 ->{
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println(a+b);
            }
            case 2 ->{
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println(a-b);
            }
            case 3 ->{
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println(a*b);
            }
            case 4 ->{
                float a = sc.nextInt();
                float b = sc.nextInt();
                System.out.println(a/b);
            }
            default -> {
                System.out.println("Wrong input");
            }
        }
    }
}
