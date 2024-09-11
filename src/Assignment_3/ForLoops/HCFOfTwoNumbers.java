package Assignment_3.ForLoops;

import java.util.Scanner;

public class HCFOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        int hcf = 1;

        // Find HCF using for loop
        for (int i = 1; i <= Math.min(num1, num2); i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;
            }
        }

        System.out.println("HCF (GCD) of " + num1 + " and " + num2 + " is: " + hcf);
    }
}
