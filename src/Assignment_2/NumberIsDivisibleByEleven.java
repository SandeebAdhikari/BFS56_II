package Assignment_2;

import static Assignment_2.utilities.inputNumberAndString.InputNumber;

public class NumberIsDivisibleByEleven {
    public static void main(String[] args) {
        int number = InputNumber();
        numberIsDivisibleByEleven(number);
    }

    private static void numberIsDivisibleByEleven(int num) {
        if (num % 11 == 0) {
            System.out.println(num + " is a divisible by five");
        }else{
            System.out.println(num + " is not a divisible by five");
        }
    }
}
