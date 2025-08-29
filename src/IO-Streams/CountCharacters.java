/*
 * Write a program to count the number of times a character appears in a File. 
 * [Note : The character check is case insensitive... i.e, 'a' and 'A' are considered to be the same]
 * 
 * Sample Input and Output:
 * Enter the file name
 * Input.txt
 * Enter the character to be counted
 * r
 * File 'Input.txt' has 99 instances of letter 'r'.
 */

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name");
        String fileName = sc.nextLine();
        System.out.println("Enter the character to be counted");
        String input = sc.next();
        char c = input.toLowerCase().charAt(0);
        int count = 0;
        try (FileReader fr = new FileReader(fileName)) {
            int i;
            while ((i = fr.read()) != -1) {
                if (Character.toLowerCase((char) i) == c) {
                    count++;
                }
            }
            System.out.println("File '" + fileName + "' has " + count + " instances of letter '" + c + "'.");
        } catch (IOException e) {
            e.getMessage();
        }
        sc.close();
    }
}
