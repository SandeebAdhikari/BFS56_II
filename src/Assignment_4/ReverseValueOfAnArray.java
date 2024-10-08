package Assignment_4;

import static Assignment_4.utilities.ArrayOfStringAndNumber.arrayOfNumber;

public class ReverseValueOfAnArray {
    public static void main(String[] args) {
        int [] array = arrayOfNumber();
        reverseValueOfAnArray(array);
    }
    private static void reverseValueOfAnArray(int [] array){
        int length = array.length;
        int [] newArray = new int[length];
        int newLength = length;
        System.out.print("Original array is: \n");
        for(int i = 0; i < length; i++){
            System.out.print(array[i]+ " ");
            newArray[newLength-1] = array[i];
            newLength = newLength - 1;
        }
        System.out.print("\nReversed array is: \n");
        for (int k = 0; k < length; k++) {
            System.out.print(newArray[k]+ " ");
        }
    }
}
