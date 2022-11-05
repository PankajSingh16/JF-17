public class Day10 {
    public static void main(String[] args) {
        int units = 460;
        double amt = 0;
        if (units > 400) {
            amt = amt + (units - 400) * 13;
            System.out.println(amt + 200*8 + 100*6 + 100*4.2 );
            units = 400;
        } else if (units >200) {
            amt = amt + (units-200)*8;
            System.out.println(amt + (100*6) + (100*4.2));
            units= 200;
        } else if (units >100 ) {
            amt = amt +(units-100)*6;
            System.out.println(amt + (100*4.2));
            units = 100;
        } else if (units>0) {
            amt = units*4.2;
            System.out.println(amt);
        }
        else {
            System.out.println("invalid input");
        }
    }
}



