import java.util.*;
import java.math.*;

public class javaexercise1 {

    // Enter 3 numbers from the user & make a function to print their average.
    // public static void printAverage(int a, int b, int c) {
    // float avg = (float) ((a + b + c) / 3.0);
    // System.out.println("The average of three numbers is: " + avg);
    // }

    // public static void printSumOfOdd(int n) {
    // int sum = 0;
    // for (int i = 0; i <= n; i++) {

    // if (i % 2 != 0) {
    // sum += i;
    // }
    // }
    // System.out.println(sum);
    // }

    // public static int greaterNumber(int a, int b) {
    // if (a >= b)
    // return a;
    // else
    // return b;
    // }

    // public static float calculateCircumference(int r) {
    // return 2 * (22 / 7) * r;
    // }

    // public static void checkVoteEligibility(int age) {
    // if (age > 18) {
    // System.out.println("Eligible to vote!!");
    // } else {
    // System.out.println("Not eligible to vote!!");
    // }
    // }

    // public static void infiniteLoop() {
    // do {
    // System.out.println("Hii");
    // } while (true);
    // }

    // public static void enterAndCount() {
    // Scanner sc = new Scanner(System.in);

    // System.out.println("Enter one if you want me to enter numbers randomly or
    // zero to stop: ");
    // int a = sc.nextInt();
    // int pos = 0;
    // int neg = 0;
    // int zero = 0;
    // while (true) {
    // switch (a) {
    // case 1:
    // double b = Math.random() * 100;
    // if (b > 0) {
    // pos++;
    // } else if (b < 0) {
    // neg++;
    // } else {
    // zero++;
    // }
    // System.out.println(a);
    // break;
    // case 0:
    // System.out.println("The number of postives entered so far: " + pos);
    // System.out.println("The number of negatives entered so far: " + neg);
    // System.out.println("The number of zeros entered so far: " + zero);
    // break;
    // default:
    // System.out.println("Enter a valid number!1");
    // break;
    // }
    // }
    // }

    // public static void calculateGCD(int a, int b) {
    // if (a > b) {
    // for (int i = b; i >= 0; i--) {
    // if (b % i == 0 && a % i == 0) {
    // System.out.println(i);
    // break;
    // }
    // }
    // } else {
    // for (int i = a; i >= 0; i--) {
    // if (b % i == 0 && a % i == 0) {
    // System.out.println(i);
    // break;
    // }
    // }
    // }

    // }

    public static void fibonacciSeries(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {

            int sum1 = i + sum;
            sum = sum1;
            System.out.println(sum1);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // printAverage(a, b, c);
        // int n = sc.nextInt();
        // printSumOfOdd(n);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // System.out.println(greaterNumber(a, b));

        // int r = sc.nextInt();
        // System.out.println(calculateCircumference(r));
        // int age = sc.nextInt();
        // checkVoteEligibility(age);
        // infiniteLoop();
        // enterAndCount();
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // calculateGCD(a, b);
        int n = sc.nextInt();
        fibonacciSeries(n);
    }
}
