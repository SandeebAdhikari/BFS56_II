package Assignment_2;

import static Assignment_2.utilities.inputNumberAndString.InputNumber;

public class NumberIsDivisibleByThree {
    public static void main(String[] args) {
        int number = InputNumber();
        numberIsDivisibleByThree(number);
    }
    private static void numberIsDivisibleByThree(int num) {
        if (num % 3 == 0){
            System.out.println("Number is Divisible by Three");
        }else{
            System.out.println("Not divisible by three number");
        }
    }
}
