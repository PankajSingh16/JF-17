import java.util.Scanner;
public class Day19 {
    public static void main(String[] args) {
        //array index= base address + (size of datatype * array index)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size =sc.nextInt();
        int []arr=new int[size];
        int sum =0;
        for (int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        for (int i=0;i<arr.length-1;i++){
            System.out.print(arr[i] + " + ");
        }
        System.out.println(arr[arr.length-1] + " = " + sum);

    }
}
