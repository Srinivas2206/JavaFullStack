import java.util.*;

public class Strings {
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();

        // String[] strings = new String[size];
        // int toLength = 0;

        // for (int i = 0; i < size; i++) {
        // strings[i] = sc.next();
        // toLength += strings[i].length();
        // }
        // System.out.println("Total length of the strings are : " + toLength);

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a String: ");
        // String original = sc.next();
        // String result = "";

        // for (int i = 0; i < original.length(); i++) {
        // if (original.charAt(i) == 'e') {
        // result += 'i';
        // } else {
        // result += original.charAt(i);
        // }
        // }
        // System.out.println(result);

        // Scanner sc = new Scanner(System.in);
        // String email = sc.next();
        // String userName = "";

        // for (int i = 0; i < email.length(); i++) {
        // if (email.charAt(i) == '@') {
        // break;
        // } else {
        // userName += email.charAt(i);
        // }
        // }
        // System.out.println(userName);

        // StringBuilder sb = new StringBuilder("Tony");
        // sb.append(" Stark");
        // System.out.println(sb);

        StringBuilder sb = new StringBuilder("Srinivas");

        for (int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - i - 1;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
}
