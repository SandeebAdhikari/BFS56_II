package Assignment_4;

import static Assignment_4.utilities.ArrayOfStringAndNumber.arrayOfString;

public class CommonElementBetweenTwoStringArray {
    public static void main(String[] args) {
        String[] arr1  = arrayOfString();
        String[] arr2  = arrayOfString();

        commonElementBetweenTwoStringArray(arr1, arr2);

    }
    private static  void commonElementBetweenTwoStringArray(String[] arr1, String[] arr2){
        System.out.println("The common element between two array: ");
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length; j++){
                if(arr1[i].equals(arr2[j])){
                    System.out.print(arr1[i]+" ");
                }
            }
        }
    }
}
