import java.util.Scanner;

public class Pactice {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("String followed by an integer");
        String s1;
        int x;
        for(int i=0;i<3;i++){
            s1=sc.next();
            x=sc.nextInt();
            //Complete this line
            for(int j=0;j<i;i++){
            System.out.println(s1+" " +x);
            }
        }

    }
}



