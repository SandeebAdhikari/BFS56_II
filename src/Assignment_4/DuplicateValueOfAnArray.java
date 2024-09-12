package Assignment_4;

import static Assignment_4.utilities.ArrayOfStringAndNumber.arrayOfNumber;

public class DuplicateValueOfAnArray {
    public static void main(String[] args) {
        int [] number = arrayOfNumber();
        duplicateValueOfAnArray(number);
    }
    private static void duplicateValueOfAnArray(int [] number){
        boolean hasDuplicate = false;
        System.out.println("Duplicate values on array: ");
        for(int i = 0; i < number.length; i++){
            for(int j = i +1; j <number.length; j++) {
                if (number[i] == number[j]) {
                    System.out.print(number[i] + " ");
                    hasDuplicate = true;
                    break;
                }
            }
        }
        if (!hasDuplicate ){
            System.out.println("Array does not contain duplicates!");
        }
    }
}
