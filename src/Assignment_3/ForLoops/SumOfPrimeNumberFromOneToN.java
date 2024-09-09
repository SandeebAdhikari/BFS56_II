package Assignment_3.ForLoops;

import static Assignment_3.utilities.Utilities.InputNumber;

public class SumOfPrimeNumberFromOneToN {
    public static void main(String[] args) {
        int num = InputNumber();
        sumOfPrimeNumberFromOneToN(num);
    }
    private static void sumOfPrimeNumberFromOneToN(int num){
        int sum = 0;
        System.out.println("Sum of Prime Number between 1 to "+num+" are:");
        for(int i = 2; i<= num; i++){
            if(isPrime(i)){
                sum =+ i;
            }
        }
        System.out.print(sum);
    }

    private static boolean isPrime(int n){

        if (n < 2){
            return false;
        }

        for(int i = 2; i<= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return  true;
    }
}
