package Assignment_4;

import java.util.Scanner;

import static Assignment_4.utilities.ArrayOfStringAndNumber.arrayOfNumber;

public class RemoveSpecificValueFromAnArray {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int [] array = arrayOfNumber();
        removeSpecificValueFromAnArray(array);

    }


    private static void removeSpecificValueFromAnArray(int [] array){
        System.out.print("Enter the number to remove: ");
        int number = scan.nextInt();
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Number " + number + " not found in the array.");
            return;
        }
        int [] newArray = new int[array.length-count];
        for(int i =0, j = 0; i < array.length; i++){
            if(array[i] != number){
                newArray[j++] = array[i];
            }
        }
       System.out.println("New array: ");
        for (int num : newArray) {
            System.out.print(num + " ");
        }
    }

}
