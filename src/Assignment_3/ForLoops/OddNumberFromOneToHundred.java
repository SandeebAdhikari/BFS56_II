package Assignment_3.ForLoops;

import static Assignment_3.utilities.Utilities.InputNumber;

public class OddNumberFromOneToHundred {
    public static void main(String[] args) {
        int num = InputNumber();
        oddNumberFromOneToHundred(num);
    }
    private static void oddNumberFromOneToHundred(int num){
        System.out.println("Even number between 1 to "+ num+ ":");
        for(int i = 1; i <= num; i++){
            if(i % 2 != 0) {
                    System.out.print( i+"," );
            }
        }
    }
}

