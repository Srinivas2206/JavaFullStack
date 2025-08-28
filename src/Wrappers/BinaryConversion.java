package Wrappers;

import java.util.Scanner;

public class BinaryConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer number between 1 and 255: ");
        int num = sc.nextInt();
        String binary = String.format("%8s", Integer.toBinaryString(num)).replace(' ', '0');
        System.out.println("Binary equivalent (8 bits): " + binary);


    }
}
