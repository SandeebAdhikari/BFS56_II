package Assignment_3.ForLoops;

import static Assignment_3.utilities.Utilities.InputNumber;

public class EvenNumberFromOneToHundred {
    public static void main(String[] args) {
        int num = InputNumber();
        evenNumberFromOneToHundred(num);
    }

    private static void evenNumberFromOneToHundred(int num){
        System.out.println("Even number between 1 to "+ num+ ":");
        for(int i = 1; i <= num; i++){
            if(i % 2 == 0) {
                System.out.print( i+"," );
            }
        }
    }
}
