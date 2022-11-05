public class Day3 {
    public static void main(String[] args) {
       // long b = 2147483648L;
       // System.out.println;
        Float a = 1.0F;
        // non-nmeric boolean -true or false, char
        for (int i=1;i<=65536;i++) {
            System.out.print((char) i);
            if (i % 40 == 0)
                System.out.println(a);

        }

    }
}
