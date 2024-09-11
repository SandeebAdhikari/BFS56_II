package Assignment_3.ForLoops;

public class SwapValuesUsingThirdVariable {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before Swap:");
        System.out.println("a = " + a + ", b = " + b);
        swapValuesUsingThirdVariable(a, b);
    }
    private static void swapValuesUsingThirdVariable(int a, int b){
        for (int i = 0; i < 1; i++) {
            int temp = a;
            a = b;
            b = temp;
        }
        System.out.println("After Swap:");
        System.out.println("a = " + a + ", b = " + b);
    }
}
