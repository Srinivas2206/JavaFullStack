/*
 * Write a class MathOperation which accepts 5 integers through command line. 
 * Create an array using these parameters. 
 * Loop through the array and obtain the sum and average of all the elements and display the result. 
 * Various exceptions that may arise like ArithmeticException, NumberFormatException, and so on should be handled.
*/

import java.util.Scanner;

public class MathOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;
        double avg = 0.0;
        System.out.println("Enter 5 integers: ");
        for (int i = 0; i < 5; i++) {
            try {
                arr[i] = Integer.parseInt(sc.nextLine());
                sum += arr[i];
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
                i--;
            }
        }
        try {
            avg = sum / 5.0;
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + avg);
        } catch (ArithmeticException e) {
            System.out.println("Error in calculating average: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
    
}
