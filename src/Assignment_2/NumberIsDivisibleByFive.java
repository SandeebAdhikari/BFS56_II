package Assignment_2;

import static Assignment_2.utilities.inputNumberAndString.InputNumber;

public class NumberIsDivisibleByFive {
    public static void main(String[] args) {
        int number = InputNumber();
        numberIsDivisibleByFive(number);
    }

    private static void numberIsDivisibleByFive(int num) {
        if (num % 5 == 0) {
            System.out.println(num + " is a divisible by five");
        }else{
            System.out.println(num + " is not a divisible by five");
        }
    }
}
