package Assignment_4;

import java.util.Scanner;

import static Assignment_4.utilities.ArrayOfStringAndNumber.arrayOfNumber;

public class IndexOfAnArray {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        int [] array = arrayOfNumber();
        indexOfAnArray(array);
    }
    private static void indexOfAnArray(int[] array){
        boolean hasNumberOnArray= false;
        System.out.println("Enter a number to find index of it: ");
        int number = scan.nextInt();
        for(int i = 0; i < array.length; i++){
            if(array[i] == number){
                System.out.println(i+" is the index of the number.");
                hasNumberOnArray = true;
            }
        }
        if(!hasNumberOnArray){
            System.out.println("Number does not exist in array!!");
        }
    }
}
