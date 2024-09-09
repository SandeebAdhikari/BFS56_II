package Assignment_3.ForLoops;

import static Assignment_3.utilities.Utilities.InputNumber;

public class ReverseOrderNaturalNumber {
    public static void main(String[] args) {
        int num = InputNumber();
        reverseOrderNaturalNumber(num);
    }
    private static void reverseOrderNaturalNumber(int num){
        for(int i = num; i >= 1; i--){
            System.out.print(i + " ");
        }
    }
}
