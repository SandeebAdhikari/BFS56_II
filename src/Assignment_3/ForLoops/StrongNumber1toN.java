package Assignment_3.ForLoops;

import static Assignment_3.utilities.Utilities.InputNumber;

public class StrongNumber1toN {
    public static void main(String[] args) {
        int num = InputNumber();
        for(int i = 0; i < num; i++){
            if (isStrongNumber(i)){
                System.out.print(i+ " ");
            }
        }
    }

    public static boolean isStrongNumber(int num){
        String numString = String.valueOf(num);
        int sum = 0;
        for(int i = 0; i < numString.length(); i++){
            int digit = Character.getNumericValue(numString.charAt(i));  // Extract each digit
            sum += factorial(digit);
        }
        return sum == num;
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
