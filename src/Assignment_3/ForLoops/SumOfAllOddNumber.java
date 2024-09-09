package Assignment_3.ForLoops;

import static Assignment_3.utilities.Utilities.InputNumber;

public class SumOfAllOddNumber {
    public static void main(String[] args) {
        int num = InputNumber();
        sumOfAllOddNumber(num);
    }

    private static void sumOfAllOddNumber(int num){
        int sum = 0;
        System.out.println("Sum of even number between 1 to "+ num+ ":");
        for(int i = 1; i <= num; i++){
            if(i % 2 != 0) {
                sum += i;
            }
        }
        System.out.print(sum);
    }

}
