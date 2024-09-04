package swapping;

public class finalBillAmount {
    public static void main(String[] args) {
        finalBillAmounts(2, 399, 20);
    }

    private static void finalBillAmounts(int numOfpizza, int pizzaCost, double discountPercentage) {
        double totalCost = numOfpizza * (pizzaCost - pizzaCost * discountPercentage/100);
        System.out.printf("Final Bill Amount: %.2f%n", totalCost);
    }
}
