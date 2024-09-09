package Assignment_3.ForLoops;

import static Assignment_3.utilities.Utilities.InputNumber;

public class MultiplicationOfNumber {
    public static void main(String[] args) {
        int num = InputNumber();
        multiplicationOfNumber(num);

    }
    private static void multiplicationOfNumber(int num){
        int muliplication = 0;
        for(int i = 1; i <= 10; i++){
            muliplication = num * i;
            System.out.println(muliplication);
        }

    }
}
