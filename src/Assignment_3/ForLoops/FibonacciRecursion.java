package Assignment_3.ForLoops;

import static Assignment_3.utilities.Utilities.InputNumber;

public class FibonacciRecursion {
    public static void main(String[] args) {
        int n = InputNumber();

        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
