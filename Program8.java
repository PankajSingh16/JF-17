import java.util.Scanner;
public class Program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temperature in Fahrenheit: ");
        double temp  = sc.nextDouble();
        double celsius = ((temp - 32)*5)/9;
        System.out.println("Temperature in Celcius = " + celsius);
    }
}
