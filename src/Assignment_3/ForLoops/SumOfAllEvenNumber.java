package Assignment_3.ForLoops;

import static Assignment_3.utilities.Utilities.InputNumber;

public class SumOfAllEvenNumber {
    public static void main(String[] args) {
        int num = InputNumber();
        sumOfAllEvenNumber(num);
    }

    private static void sumOfAllEvenNumber(int num){
        int sum = 0;
        System.out.println("Sum of even number between 1 to "+ num+ ":");
        for(int i = 1; i <= num; i++){
            if(i % 2 == 0) {
                sum += i;
            }
        }
        System.out.print(sum);
    }
}
