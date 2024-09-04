package swapping;

public class taxAmount {
    public static void main(String[] args) {
        taxAmounts(85000, 20);
    }
    private static void taxAmounts(double salary, double tax) {
        double taxAmount =  salary * tax/100;
        System.out.printf("Total tax amount: %.2f%n ",taxAmount);
    }
}
