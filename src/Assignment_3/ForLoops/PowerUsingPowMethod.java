package Assignment_3.ForLoops;

public class PowerUsingPowMethod {
    public static void main(String[] args) {
        int base = 2;
        int exponent = 5;
        double result = Math.pow(base, exponent);


        for (int i = 0; i < 1; i++) {
            System.out.println(base + " raised to the power of " + exponent + " is: " + result);
        }
    }
}
