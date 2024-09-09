package Assignment_3.ForLoops;

import static Assignment_3.utilities.Utilities.InputNumber;

public class PrimeNumberFromOneToN {
    public static void main(String[] args) {
        int num = InputNumber();
        primeNumberFromOneToN(num);
    }
    private static void primeNumberFromOneToN(int num){
        System.out.println("Prime Number between 1 to "+num+" are:");
        for(int i = 2; i<= num; i++){
            if(isPrime(i)){
                System.out.print(i+ " ");
            }
        }
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
