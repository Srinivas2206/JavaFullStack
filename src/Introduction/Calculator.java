public class Calculator {
    /*
     * Create a new class called Calculator with the following methods:
     * 1. A static method called powerInt(int num1,int num2)This method should
     * return num1 to the power num2.
     * 2. A static method called powerDouble(double num1,int num2).This method
     * should return num1 to the power num2.
     * 3. Invoke both the methods and test the functionalities.Hint: Use
     * Math.pow(double,double) to calculate the power.
     */

    static double powerInt(int num1, int num2) {
        return Math.pow(num1, num2);
    }

    static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }

    public static void main(String[] args) {
        System.out.println(powerInt(10, 2));
        System.out.println(powerDouble(10, 3));
    }
}
