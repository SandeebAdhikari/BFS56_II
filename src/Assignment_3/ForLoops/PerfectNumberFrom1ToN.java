package Assignment_3.ForLoops;

import static Assignment_3.utilities.Utilities.InputNumber;

public class PerfectNumberFrom1ToN {
    public static void main(String[] args) {
        int num = InputNumber();
        primeNumberFromOneToN(num);
    }

    private static void primeNumberFromOneToN(int num){
        System.out.println("Perfect numbers between 1 and " + num + ":");
        for(int i = 1; i <= num; i++){
            if (isPerfect(i)){
               System.out.print(i+ " ");
            }
        }
    }

    private static boolean isPerfect(int num) {
        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
}
