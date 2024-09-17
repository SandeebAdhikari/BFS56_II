package Assignment_4;

import static Assignment_4.utilities.ArrayOfStringAndNumber.arrayOfNumber;

public class CopyElementToAnotherArray {
    public static void main(String[] args) {
            int [] array1 = arrayOfNumber();
            int [] array2 = {};

            copyElementToAnotherArray(array1, array2);
    }
    private static void copyElementToAnotherArray(int [] array1, int [] array2){
        System.out.println("Copy Element From One Array to Another Array: ");
        for(int i = 0; i < array1.length; i++){
            for (int j = 0; j <array2.length; j++) {
                int temp = array1[i];
                array1[i] = array2[j];
                array2[j] = temp;
                System.out.print(array2[j]+" " );
            }
            //System.out.print(array1[i]+" " );
            System.out.println();
        }
    }
}
