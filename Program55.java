import java.util.*;
public class Program55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Smoothy");
        System.out.println("Press 1 to Indian cuisine");
        System.out.println("Press 2 to Italian cuisine");
        System.out.println("Press 3 to Chinise cuisine");
        int n = sc.nextInt();
        switch (n){
            case 1->{
                System.out.println("Press 1 to Samosa");
                System.out.println("Press 2 to Biryani");
                System.out.println("Press 3 to Chhole Kulcha");
                System.out.println("Press 4 to Gulab Jamun");
                int i =sc.nextInt();
                switch (i){
                    case 1 -> {
                        System.out.println("Samosa Price = 10 Rs");
                        System.out.println("Enter Quantity");
                        int q1 = sc.nextInt();
                        int total = q1*10;
                        System.out.println("Total amount = " + total);
                    }
                    case 2 -> {
                        System.out.println("Biryani Price = 100 Rs");
                        System.out.println("Enter Quantity");
                        int quantity = sc.nextInt();
                        int total = quantity*100;
                        System.out.println("Total amount = " + total);
                    }
                    case 3 -> {
                        System.out.println("Chhole Kulcha Price = 150 Rs");
                        System.out.println("Enter Quantity");
                        int quantity = sc.nextInt();
                        int total = quantity*150;
                        System.out.println("Total amount = " + total);
                    }
                    case 4 -> {
                        System.out.println("Gulab Jamun Price = 10");
                        System.out.println("Enter Quantity");
                        int q4 = sc.nextInt();
                        int total = q4*10;
                        System.out.println("Total amount = " + total + " Rs");
                    }
                    default -> {
                        System.out.println("Please enter valid input");
                    }

                }
            }
            case 2->{
                System.out.println("Press 1 to Polenta");
                System.out.println("Press 2 to Rasanga");
                System.out.println("Press 3 to Ravioli");
                System.out.println("Press 4 to Ribollita");
                int i =sc.nextInt();
                switch (i){
                    case 1 -> {
                        System.out.println("Polenta Price = 100 Rs");
                        System.out.println("Enter Quantity");
                        int q1 = sc.nextInt();
                        int total = q1*100;
                        System.out.println("Total amount = " + total + " Rs");
                    }
                    case 2 -> {
                        System.out.println("Rasana Price = 200 Rs");
                        System.out.println("Enter Quantity");
                        int q1 = sc.nextInt();
                        int total = q1*200;
                        System.out.println("Total amount = " + total + " Rs");
                    }
                    case 3 -> {
                        System.out.println(" Ravioli Price = 150 Rs");
                        System.out.println("Enter Quantity");
                        int q1 = sc.nextInt();
                        int total = q1*150;
                        System.out.println("Total amount = " + total + " Rs");
                    }
                    case 4 -> {
                        System.out.println("Ribollita Price = 100 Rs");
                        System.out.println("Enter Quantity");
                        int q1 = sc.nextInt();
                        int total = q1*100;
                        System.out.println("Total amount = " + total + " Rs");
                    }
                    default -> {
                        System.out.println("Please enter valid input");
                    }

                }
            }
            case 3->{
                System.out.println("Press 1 to Hot & Sour soup");
                System.out.println("Press 2 t0 Maggi");
                System.out.println("Press 3 to Quick Noodles");
                System.out.println("Press 4 to Springs Rolls");
                int i =sc.nextInt();
                switch (i){
                    case 1 -> {
                        System.out.println("Samosa Hot & Sour soup = 80 Rs");
                        System.out.println("Enter Quantity");
                        int q1 = sc.nextInt();
                        int total = q1*80;
                        System.out.println("Total amount = " + total);
                    }
                    case 2 -> {
                        System.out.println("Maggi Price = 40 Rs");
                        System.out.println("Enter Quantity");
                        int q1 = sc.nextInt();
                        int total = q1*40;
                        System.out.println("Total amount = " + total);
                    }
                    case 3 -> {
                        System.out.println("Noodles Price = 80 Rs");
                        System.out.println("Enter Quantity");
                        int q1 = sc.nextInt();
                        int total = q1*80;
                        System.out.println("Total amount = " + total);
                    }
                    case 4 -> {
                        System.out.println("Springs Rolls Price = 100 Rs");
                        System.out.println("Enter Quantity");
                        int q1 = sc.nextInt();
                        int total = q1*100;
                        System.out.println("Total amount = " + total + " Rs");
                    }
                    default -> {
                        System.out.println("Please enter valid input");
                    }
                }
            }
            default -> {
                System.out.println("Please enter valid input");
            }
        }
        System.out.println("Enjoy your Meal!!");
    }
}
