package Assignment_3.ForLoops;

import static Assignment_3.utilities.Utilities.InputNumber;

public class FrequencyOfDigits {
    public static void main(String[] args) {
        int num = InputNumber();

        int[] frequency = new int[10];  // Array to store the frequency of digits (0-9)

        // Calculate frequency of each digit
        for (int temp = num; temp != 0; temp /= 10) {
            int digit = temp % 10;
            frequency[digit]++;
        }

        // Print the frequency of each digit
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + ": " + frequency[i]);
            }
        }
    }
}
