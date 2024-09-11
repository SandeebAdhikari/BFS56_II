package Assignment_3.ForLoops;

import static Assignment_3.utilities.Utilities.InputNumber;

public class PowerOfNumberWithoutUsingPow {
    public static void main(String[] args) {
        int num = InputNumber();
        powerOfNumberWithoutUsingPow(num);
    }
    private static void powerOfNumberWithoutUsingPow(int num){
        int base = 2;
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= base;
        }
        System.out.println(base + " raised to the power of " + num + " is: " + result);
    }
}
