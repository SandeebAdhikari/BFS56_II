package Assignment_3.ForLoops;


import static Assignment_3.utilities.Utilities.InputNumber;

public class PrimeNumberOrNot {
    public static void main(String[] args) {
        int num = InputNumber();
        if(primeNumberOrNot(num)){
            System.out.println(num +" is a prime number.");
        }else{
            System.out.println(num +" is not a prime number.");
        }
    }
    private static boolean primeNumberOrNot(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
