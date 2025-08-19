import java.util.*;

public class Bits {
    public static void main(String[] args) {
        // Get Bit
        // int n = 5;
        // int pos = 2;
        // int bitMask = 1 << pos;
        // System.out.println(bitMask);
        // if ((bitMask & n) == 0) {
        // System.out.println("Bit was zero");
        // } else {
        // System.out.println("Bit was one");
        // }

        // Set Bit
        // int n = 5;
        // int pos = 1;
        // int bitMask = 1 << pos;

        // int newNumber = bitMask | n;
        // System.out.println(newNumber);

        // Clear bit
        // int n = 5;
        // int pos = 2;
        // int bitMask = 1 << pos;

        // int notBitMask = ~(bitMask);
        // int newNumber = notBitMask & n;
        // System.out.println(newNumber);

        // Update bit
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        int n = 5;
        int pos = 2;
        int bitMask = 1 << pos;

        if (oper == 1) {
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else {
            int notBitMask = ~(bitMask);
            int newNumber = notBitMask & n;
            System.out.println(newNumber);
        }
    }
}
