package Assignment_3.ForLoops;

import static Assignment_3.utilities.Utilities.InputString;

public class SumOfDigits {
    public static void main(String[] args) {
        String num = InputString();
        sumOfDigits(num);
    }
    private static void sumOfDigits(String num){
        int sum = 0;
        for(int i = 0; i <= num.length(); i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
