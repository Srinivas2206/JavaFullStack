package Strings;

public class CheckPalindrome {
    // Write a Program to check whether a given String is Palindrome or not.
    public static boolean checkPalindrome(String s) {
        StringBuffer sb = new StringBuffer();
        sb.append(s);
        return s.equals(sb.reverse().toString());
    }

    public static void main(String[] args) {

    }
}
