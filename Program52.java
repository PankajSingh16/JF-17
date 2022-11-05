import java.util.*;
public class Program52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day number (1-7)");
        int day = sc.nextInt();
        switch (day){
            case 1 ->
            {
                System.out.printf("Monday");
            }
            case 2->{
                System.out.printf("Tuesday");
            }
            case 3 ->{
                System.out.printf("Wednesday");
            }
            case 4 ->{
                System.out.printf("Thursday");
            }
            case 5 ->{
                System.out.printf("Friday");
            }
            case 6 ->{
                System.out.printf("Saturday");
            }
            case 7 ->{
                System.out.printf("Sunday");
            }
            default -> {
                System.out.printf("Wrong input");
            }
        }
    }
} 
