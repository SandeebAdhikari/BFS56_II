package Assignment_3.ForLoops;

import static Assignment_3.utilities.Utilities.InputNumber;

public class StrongNumber {
    public static void main(String[] args) {
        int num = InputNumber();
        if(isStrongNumber(num)){
            System.out.println("The number "+num+" is Strong Number.");
        }else{
            System.out.println("The number "+num+" is not Strong Number.");
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
