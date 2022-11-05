import java.util.*;
public class Program53 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the character to check");
        char ch= sc.next().charAt(0);
        switch (ch){
            case 'a', 'e', 'i', 'o', 'u','A','E','I','O','U' ->{
                System.out.println("Vowel");
            }
            default -> {
                System.out.println("Consonent");
            }
        }
    }
}
