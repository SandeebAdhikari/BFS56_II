package Assignment_1;

public class netAmount {
    public static void main(String[] args) {
        netAmounts(85000, 15, 20, 18, 20 , 25);
    }

    private static void netAmounts(int basicSalary, double ta, double da, double hra, double pf, double tax){
        double travelAllowance = basicSalary * ta/100;
        double dailyAllowance = basicSalary * da/100;
        double hourlyAllowance = basicSalary * hra/100;
        double pfAmount = basicSalary * pf/100;
        double taxAmount = basicSalary * tax/100;

        double grossAmount = basicSalary + travelAllowance + dailyAllowance + hourlyAllowance;

        double netAmounts = grossAmount -(pfAmount + taxAmount);

        System.out.printf("Gross Amount: %.2f%n", grossAmount);
        System.out.printf("Net Amount: %.2f%n", netAmounts);
    }
}
