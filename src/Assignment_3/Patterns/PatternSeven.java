package Assignment_3.Patterns;

import java.util.Arrays;

public class PatternSeven {
    static int minimumSwaps(int[] arr) {
        int count = 0;
        System.out.println("Given array: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] != i + 1) {
                // Display the swap operation
                System.out.println("Swapping " + arr[i] + " and " + arr[arr[i] - 1]);

                // Perform the swap
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;

                // Show the array after the swap
                System.out.println("After swapping: " + Arrays.toString(arr));

                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 2};
        int swaps = minimumSwaps(arr);
        System.out.println("So, we need a minimum of " + swaps + " swaps to sort the array in ascending order.");
    }
}
