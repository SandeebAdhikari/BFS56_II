package Assignment_3.ForLoops;

import static Assignment_3.utilities.Utilities.InputNumber;

public class FibonacciSeries {
    public static void main(String[] args) {
        int num = InputNumber();
        int a = 0, b = 1;

        System.out.print("Fibonacci Series: " + a + " " + b + " ");

        for (int i = 2; i < num; i++) {
            int nextTerm = a + b;
            System.out.print(nextTerm + " ");
            a = b;  // Shift numbers forward
            b = nextTerm;
        }
    }
}
