package Assignment_3.ForLoops;
import java.util.Scanner;

import static Assignment_3.utilities.Utilities.InputNumber;

public class PerfectNumber {
    public static void main(String[] args) {
        int num = InputNumber();

        if (isPerfect(num)) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }
    }

    public static boolean isPerfect(int num) {
        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
}
