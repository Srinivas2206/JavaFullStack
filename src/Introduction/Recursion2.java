public class Recursion2 {

    /*
     * // Q1. Tower of Hanoi - Transfer n disks from source to destination over 3
     * // towers.
     * public static void towerOfHanoi(int n, String src, String helper, String
     * dest) {
     * if (n == 1) {
     * System.out.println("transfer disk " + n + " from " + src + " to " + dest);
     * return;
     * }
     * 
     * // transer top n-1 disks from src to helper using dest as helper
     * towerOfHanoi(n - 1, src, dest, helper);
     * 
     * // transfer nth disk from src to dest;
     * System.out.println("transfer disk " + n + " from " + src + " to " + dest);
     * 
     * // transfer n-1 disks from helper to dest using src as helper
     * towerOfHanoi(n - 1, helper, src, dest);
     * }
     */

    /*
     * // Q2. Print a string in reverse.
     * public static String revString(String str) {
     * if (str.length() == 1) {
     * return str;
     * }
     * char currChar = str.charAt(0);
     * String nextString = revString(str.substring(1));
     * return nextString + currChar;
     * }
     */

    /*
     * // Q3. Find the occurrence of the first and last occurrence of an element
     * using
     * // recursion.
     * public static int first = -1;
     * public static int last = -1;
     * 
     * 
     * public static void getIndices(String str, char el, int idx) {
     * if (idx == str.length()) {
     * return;
     * }
     * 
     * if (str.charAt(idx) == el) {
     * if (first == -1) {
     * first = idx;
     * } else {
     * last = idx;
     * }
     * }
     * getIndices(str, el, idx + 1);
     * }
     */

    /*
     * // Q4. Check if an array is sorted (strictly increasing). - O(n)
     * public static boolean checkIfIncreasing(int arr[], int idx) {
     * if (idx == arr.length - 1) {
     * return true;
     * }
     * 
     * if (!checkIfIncreasing(arr, idx + 1)) {
     * return false;
     * }
     * 
     * return arr[idx] < arr[idx + 1];
     * }
     */

    /*
     * // Q5. Move all ‘x’ to the end of the string. - O(n)
     * public static String addX(int count) {
     * String newStr = "x";
     * for (int i = 1; i < count; i++) {
     * newStr += 'x';
     * }
     * return newStr;
     * }
     * 
     * public static String moveAllX(String str, int idx, int count) {
     * if (idx == str.length()) {
     * return addX(count);
     * }
     * 
     * if (str.charAt(idx) == 'x') {
     * return moveAllX(str, idx + 1, count + 1);
     * } else {
     * String nextStr = moveAllX(str, idx + 1, count);
     * return str.charAt(idx) + nextStr;
     * }
     * }
     */
    /*
     * // Q6. Remove duplicates in a string.
     * public static String removeDuplicates(String str, int idx, boolean present[])
     * {
     * if (idx == str.length()) {
     * return "";
     * }
     * char curr = str.charAt(idx);
     * if (present[curr - 'a']) {
     * return removeDuplicates(str, idx + 1, present);
     * } else {
     * present[curr - 'a'] = true;
     * return curr + removeDuplicates(str, idx + 1, present);
     * }
     * }
     */

    public static void main(String args[]) {
        // int n = 4;
        // towerOfHanoi(4, "A", "B", "C");
        // String str = "abcd";
        // String reversed = revString(str);
        // System.out.println(reversed);
        // String str = "tabcdfghijakkk";
        // char el = 'a';
        // getIndices(str, el, 0);
        // System.out.println("First Occurence: " + first);
        // System.out.println("Last Occurence: " + last);

        // int arr[] = { 1, 6, 3, 4, 5 };
        // if (checkIfIncreasing(arr, 0)) {
        // System.out.println("Strictly Increasing");
        // } else {
        // System.out.println("NOT Strictly Increasing");
        // }

        // String str = "abcdefghxixjxxxk";
        // int count = 0;
        // String newStr = moveAllX(str, 0, count);
        // System.out.println(newStr);

        // String str = "abcadbcefhbi";
        // boolean present[] = new boolean[str.length()];
        // System.out.println(removeDuplicates(str, 0, present));
    }
}
