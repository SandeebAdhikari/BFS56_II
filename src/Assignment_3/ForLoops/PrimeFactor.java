package Assignment_3.ForLoops;

import java.util.Scanner;

import static Assignment_3.utilities.Utilities.InputNumber;

public class PrimeFactor {
    public static void main(String[] args) {
        int num = InputNumber();

        System.out.print("Prime factors of " + num + ": ");

        // Find all prime factors
        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num /= i;  // Divide num by i as long as it's divisible
            }
        }

        System.out.println();
    }
}
