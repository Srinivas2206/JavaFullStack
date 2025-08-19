import java.util.*;

public class arrays {
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // String names[] = new String[size];
        // for (int i = 0; i < size; i++) {
        // names[i] = sc.next();
        // }
        // for (int i = 0; i < names.length; i++) {
        // System.out.println(names[i]);
        // }
        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // int numbers[] = new int[size];
        // for (int i = 0; i < size; i++) {
        // numbers[i] = sc.nextInt();
        // }
        // int mini = Integer.MAX_VALUE;
        // int maxi = Integer.MIN_VALUE;

        // for (int i = 0; i < numbers.length; i++) {
        // if (numbers[i] < mini) {
        // mini = numbers[i];
        // }

        // if (numbers[i] > maxi) {
        // maxi = numbers[i];
        // }
        // }
        // System.out.println("Maximum Value: " + maxi);
        // System.out.println("Minimum value is " + mini);
        // }

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        boolean isAscending = true;

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                isAscending = false;
            }
        }

        if (isAscending) {
            System.out.println("The array is sorted in asc");
        } else {
            System.out.println("the array is not sorted in asc");
        }

    }
}
