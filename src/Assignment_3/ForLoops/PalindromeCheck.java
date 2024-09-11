package Assignment_3.ForLoops;

import static Assignment_3.utilities.Utilities.InputNumber;

public class PalindromeCheck {
    public static void main(String[] args) {
        int num = InputNumber();
        int originalNum = num;  // Store the original number
        int reversedNum = 0;

        for (int temp = num; temp != 0; temp /= 10) {
            int digit = temp % 10;
            reversedNum = reversedNum * 10 + digit;
        }

        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");
        }
    }
}
