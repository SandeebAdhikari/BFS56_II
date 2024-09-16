package Assignment_4;

import java.util.Scanner;

public class SpecificValueInArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value to search in the array:");
        int target = scanner.nextInt();

        boolean found = containsValue(arr, target);

        if (found) {
            System.out.println("Value " + target + " is present in the array.");
        } else {
            System.out.println("Value " + target + " is not present in the array.");
        }

        scanner.close();
    }

    public static boolean containsValue(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }
}
