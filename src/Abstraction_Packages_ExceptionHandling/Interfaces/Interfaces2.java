package Interfaces;

/*
 * Create an interface Test with an abstract method "int myFunction".
 * This function takes three integer parameters.
 * Write a program to create two Test reference variables t1 and t2.
 * t1 should add three integer parameters and t2 should multiply three integer parameters, using lambda expression.
 * Call myFunction using t1 and t2 reference variables, by passing three integer values and print the result.
*/

interface Test {
    int myFunction(int a, int b, int c);
}

public class Interfaces2 {
    public static void main(String[] args) {

        Test t1 = (a, b, c) -> a + b + c;
        Test t2 = (a, b, c) -> a * b * c;
        int sumResult = t1.myFunction(1, 2, 3);
        int productResult = t2.myFunction(1, 2, 3);
        System.out.println("Sum: " + sumResult);
        System.out.println("Product: " + productResult);

    }
}
