import java.util.*;
public class Array_Practice {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size:");
        /*
        int size =sc.nextInt();
        int marks[] = new int[size];
        for (int i =0;i<size;i++){
            marks[i]=sc.nextInt();
        }
        //System.out.println(marks[3]);
        for (int i =0;i<size;i++){
            System.out.println(marks[i]);
        }

         */
        /*
        int size = sc.nextInt();
        int []numbers =new int[size];
        //int []marks ={1,2,5,78,9,4};
        for (int i =0;i<size;i++){
            numbers[i]=sc.nextInt();
        }
        for (int i=0;i<numbers.length;i++){
            System.out.println(numbers[i] +" ");

        }

         */
        int size = sc.nextInt();
        String []names=new String[size];
        System.out.println("Enter names to display:");
        for (int i=0;i<size;i++){
             names[i] =sc.nextLine();
        }
        for (int i=0;i<names.length;i++){
            System.out.println(names[i] + " " );
        }

    }
}
