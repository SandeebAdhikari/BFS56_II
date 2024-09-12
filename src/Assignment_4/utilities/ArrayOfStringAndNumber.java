package Assignment_4.utilities;

import java.util.Scanner;

public class ArrayOfStringAndNumber {
    private static Scanner scan = new Scanner(System.in);
    public static int lengthOfArray(){
        System.out.print("Enter the length of you array: ");
        int length = scan.nextInt();
        scan.nextLine();
        return length;
    }

    public static int [] arrayOfNumber(){
        int length = lengthOfArray();
        int [] array = new int[length];
        if(length >0){
            System.out.println("Enter " + length + " numbers:");
            for(int i = 0; i < length; i++){
                array[i]= scan.nextInt();
            }
        }
        return array;
    }

    public static String [] arrayOfString(){
        int length = lengthOfArray();
        String [] array = new String[length];
        if(length >0){
            System.out.println("Enter " + length + " String:");
            for(int i = 0; i < length; i++){
                array[i]= scan.nextLine();
            }
        }
        return array;
    }

}
