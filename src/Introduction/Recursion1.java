import java.util.*;

public class Recursion1 {
    // Q1. Print numbers from 5 to 1.
    public static void printNumbers(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNumbers(n - 1);
    }

    // Q2. Print numbers from 1 to 5.
    public static void printNumbers2(int n) {
        if (n == 0) {
            return;
        }
        printNumbers2(n - 1);
        System.out.println(n);
    }

    // Q3. Print the sum of first n natural numbers.
    // public static void calcSum(int n, int sum) {
    // if (n == 0) {
    // System.out.println(sum);
    // return;
    // }
    // sum += n;
    // calcSum(n - 1, sum);
    // }

    // Q4. Print factorial of a number n.
    public static int printFact(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }

        int nminFact = printFact(n - 1);
        return n * nminFact;
    }

    // Q5. Print the fibonacci sequence till nth term.
    public static void printFib(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        System.out.println(a);
        printFib(b, a + b, n - 1);
    }

    // Q6. Print x^n (with stack height = n)
    public static int xPow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }

        int x_ = xPow(x, n - 1);
        int xn = x * x_;
        return xn;
    }

    // Q7. Print x^n (with stack height = logn)
    public static int printPower(int x, int n) {
        if (n == 0) {
            return 1;
        }

        if (n % 2 == 0) {
            return printPower(x, n / 2) * printPower(x, n / 2);
        } else {
            return printPower(x, n / 2) * printPower(x, n / 2) * x;
        }
    }

    public static void main(String args[]) {
        // printNumbers(5);
        // printNumbers2(5);
        // calcSum(5, 0);
        // int fact = printFact(5);
        // System.out.println(fact);
        // printFib(0, 1, 5);
        // System.out.println(xPow(2, 5));
        System.out.println(printPower(2, 5));
    }
}
