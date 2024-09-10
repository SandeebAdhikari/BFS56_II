package Assignment_3.ForLoops;

import static Assignment_3.utilities.Utilities.InputNumber;

public class ArmstrongNumber1ToN {
    public static void main(String[] args) {
        int num = InputNumber();
        armstrongNumber1ToN(num);
    }

    private static void armstrongNumber1ToN(int num){
        for(int i = 1; i <= num; i++){
            if(isArmstrong(i)){
                System.out.print(i+ " ");
            }
        }
    }

    private static boolean isArmstrong(int num){
        int sum = 0;
        int originalNumber = num;
        int numLength = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            sum += (int) Math.pow(digit, numLength);
            num /= 10;
        }
        return sum == originalNumber;
    }
}
