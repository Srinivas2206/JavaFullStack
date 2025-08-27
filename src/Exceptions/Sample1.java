import java.util.Scanner;

/*
 * Write a Program to take care of Number Format Exception 
 * if user enters values other than integer for calculating average marks of 2 students. 
 * The name of the students and marks in 3 subjects are taken from the user while executing the program.
 * In the same Program write your own Exception classes to take care of Negative values and values out of range 
 * (i.e. other than in the range of 0-100)
*/

public class Sample1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 2; i++) {
            System.out.println("Enter the name of the Student " + i + ": ");
            String name = sc.nextLine();

            int[] marks = new int[3];
            for (int j = 0; j < 3; j++) {
                while (true) {
                    System.out.print("Enter the marks for Subject " + (j + 1) + ": ");
                    String input = sc.nextLine();

                    try {
                        int mark = Integer.parseInt(input);
                        if (mark < 0) {
                            throw new NegativeValueException("Marks cannot be negative");
                        }
                        if (mark > 100) {
                            throw new OutOfRangeException("Marks must be between 0 and 100");
                        }
                        marks[j] = mark;
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input! Please enter an integer value.");
                    } catch (NegativeValueException | OutOfRangeException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
            int total = marks[0] + marks[1] + marks[2];
            double average = total / 3.0;
            System.out.println("Average marks for " + name + ": " + average);
        }
        sc.close();
    }
}

class NegativeValueException extends Exception {
    public NegativeValueException(String message) {
        super(message);
    }
}

class OutOfRangeException extends Exception {
    public OutOfRangeException(String message) {
        super(message);
    }
}
