public class Day15 {
    public static void main(String[] args) {
        /*switch  can be used in three condition
        //1. single variable
        //2.constant se compare kara rahe ho
        3. only with == , that is switch is not working with less than(<=) or more than(>=) or less (<) or more (>)
        // if else is hit and trial but switch is not.
        // switch is alternate of if and else statement
        // structure of switch statement
        switch(day){
        case 1 ->{}
        case 2 ->{}
        .
        .
        .
        }
         */
        int day = 5;
        switch (day){
            case 1 -> {
                System.out.println("Monday");
            }
            case 2 -> {
                System.out.println("Tuesday");
            }
            case 3 -> System.out.println("Wednesday");
            case 4 ->{
                System.out.println("Thurday");
            }
            case 5 ->{
                System.out.println("Friday");
            }
            case 7 ->{
                System.out.println("Saturday");
            }
            default -> {
                System.out.println("Wrong input");
            }
        }

    }
}
