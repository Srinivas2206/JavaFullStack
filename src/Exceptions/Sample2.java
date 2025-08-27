import java.util.Scanner;

/*
 * Write a program to accept name and age of a person from the command prompt(passed as arguments 
 * when you execute the class) and ensure that the age entered is >=18 and < 60. 
 * Display proper error messages. The program must exit gracefully after displaying the error message 
 * in case the arguments passed are not proper. (Hint : Create a user defined exception class for handling errors.)
*/

class AgeLimitException extends Exception {
    public AgeLimitException(String message) {
        super(message);
    }
}

public class Sample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String name = args[0];
            int age = Integer.parseInt(args[1]);
            if (age < 18 || age >= 60) {
                throw new AgeLimitException("Age should be greater than or equal to 18 and less than 60");
            } else {
                System.out.println("Entered Successfully.");
            }
        } catch (AgeLimitException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
