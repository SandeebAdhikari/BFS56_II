package Assignment_4;

import java.util.Scanner;

public class SwapTemparyVariable {
    public static void main(String[] args) {
        // Initialize two arrays of the same size
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};

        System.out.println("Original arrays:");
        System.out.print("Array 1: ");
        displayArray(arr1);
        System.out.print("Array 2: ");
        displayArray(arr2);

        // Swap arrays element by element using a temporary variable
        for (int i = 0; i < arr1.length; i++) {
            int temp = arr1[i];
            arr1[i] = arr2[i];
            arr2[i] = temp;
        }

        // Display arrays after swapping
        System.out.println("\nArrays after swapping:");
        System.out.print("Array 1: ");
        displayArray(arr1);
        System.out.print("Array 2: ");
        displayArray(arr2);
    }

    // Method to display the array
    public static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
