package Assignment_1;

public class finalPlatCost {
    public static void main(String[] args) {
        finalCost(699, 18);
    }

    public static void finalCost(int finalCost, double percent) {
        double totalCost = finalCost + finalCost * (percent /100);
        System.out.printf("Total cost of Jio Fiber Silver: %.2f%n", totalCost);
    }
}
