package Assignment_2;

import static Assignment_2.utilities.inputNumberAndString.InputNumber;

public class EvenOrOdd {
    public static void main(String[] args) {
        int number = InputNumber();
        evenOrOdd(number);
    }

    private static void evenOrOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        }else {
            System.out.println(number + " is odd");
        }
    }
}
