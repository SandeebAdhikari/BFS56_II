package Assignment_4;

import static Assignment_4.utilities.ArrayOfStringAndNumber.arrayOfNumber;

public class MaxAndMinValueOfArray {
    public static void main(String[] args) {
        int [] array = arrayOfNumber();
        maxValueOfArray(array);
        minValueOfArray(array);
    }
    private static void maxValueOfArray(int [] array){
        int maxValue = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i]>maxValue){
                maxValue = array[i];
            }
        }
        System.out.println("The Max value of array is "+maxValue);
    }
    private static void minValueOfArray(int [] array){
        int minValue = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i]< minValue){
                minValue = array[i];
            }
        }
        System.out.println("The Min value of array is "+minValue);
    }
}
