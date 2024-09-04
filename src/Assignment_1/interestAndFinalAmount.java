package Assignment_1;

public class interestAndFinalAmount {
    public static void main(String[] args) {
        interestAndFinalAmounts(500000, 5, 6.8);
    }
    private static void interestAndFinalAmounts(int p, int t, double r) {
        double interestAmount= (p * t * r)/100;
        double finalAmount = p + interestAmount;
        System.out.printf("Total interest Number: %.2f%n",  interestAmount);
        System.out.printf("Final Amount: %.2f%n",  finalAmount);
    }
}
