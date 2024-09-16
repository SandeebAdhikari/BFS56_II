package Assignment_4;

import static Assignment_4.utilities.ArrayOfStringAndNumber.arrayOfNumber;

public class CommonElementBetweenTwoArray {
    public static void main(String[] args) {
        int [] array1 = arrayOfNumber();
        int [] array2 = arrayOfNumber();
        commonElementBetweenTwoArray(array1, array2);

    }
    private static void commonElementBetweenTwoArray(int [] array1, int [] array2){
        System.out.println("The common element between two array: ");
        for(int i = 0; i < array1.length; i++){
            for(int j = 0; j <array2.length; j++){
                if(array1[i] == array2[j]) {
                    System.out.println(array1[i] + " ");
                }
            }
        }
    }
}
