/*
 * Write a program to copy contents from one file to another and check the output.
 * 
 * Sample Input and Output:
 * Enter the input file name
 * Input.txt
 * Enter the output file name
 * Output.txt
 * File is copied.
*/

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CopyContents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input file name");
        String inputFileName = sc.nextLine();
        System.out.println("Enter the output file name");
        String outputFileName = sc.nextLine();

        try (FileReader fr = new FileReader(inputFileName);
                FileWriter fw = new FileWriter(outputFileName)) {
            int i;
            while ((i = fr.read()) != -1) {
                fw.write(i);
            }
            System.out.println("File is copied");
        } catch (IOException e) {
            e.getMessage();
        }
        sc.close();
    }
}
