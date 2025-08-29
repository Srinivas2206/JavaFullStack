/*
 * Write a program to count the occurrences of each word in an input file 
 * and write the word along with its corresponding count in an output file.
 * [Note: The words should be sorted alphabetically in the output file]
 * (Hint : Consider using Map Collection)
 * 
 * For Example, let's assume the following are the contents of inputFile.txt
 * 
 * Manoj works at Wipro
 * Katari works at Wipro
 * Sureka works at Wipro
 * Harish works at Wipro
 * Anitha works at Wipro
 * Janani works at Wipro
 * 
 * D:\>Java FileWordCount inputFile.txt outputFile.txt
 * 
 * After Execution of the program the contents of outputFile.txt should be as below
 * 
 * Anitha : 1
 * Harish : 1
 * Janani : 1
 * Katari : 1
 * Manoj : 1
 * Sureka : 1
 * Wipro : 6
 * at : 6
 * works : 6
*/

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class FileWordCount {
    public static void main(String[] args) {

        String inputFile = args[0];
        String outputFile = args[1];
        HashMap<String, Integer> map = new HashMap<>();
        try (FileReader fr = new FileReader(inputFile)) {
            StringBuilder sb = new StringBuilder();
            int i;
            while ((i = fr.read()) != -1) {
                char ch = (char) i;
                if (ch == ' ' || ch == '\n' || ch == '\r') {
                    String word = sb.toString();
                    if (!word.isEmpty()) {
                        map.put(word, map.getOrDefault(word, 0) + 1);
                        sb.setLength(0); // Clear the StringBuilder for the next word
                    }
                } else {
                    sb.append(ch);
                }
            }
            // To account for the last word if file doesn't end with space/newline
            String word = sb.toString();
            if (!word.isEmpty()) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
            try (FileWriter fw = new FileWriter(outputFile)) {
                map.entrySet().stream()
                        .sorted((e1, e2) -> e1.getKey().compareTo(e2.getKey()))
                        .forEach(entry -> {
                            try {
                                fw.write(entry.getKey() + " : " + entry.getValue() + "\n");
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        });
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
