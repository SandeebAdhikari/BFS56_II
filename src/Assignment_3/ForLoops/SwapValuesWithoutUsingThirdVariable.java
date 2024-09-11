package Assignment_3.ForLoops;

public class SwapValuesWithoutUsingThirdVariable {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before Swap:");
        System.out.println("a = " + a + ", b = " + b);

        swapValuesWithoutUsingThirdVariable(a, b);
    }
    private static void swapValuesWithoutUsingThirdVariable(int a, int b){
        for (int i = 0; i < 1; i++) {
            a = a + b;
            b = a - b;
            a = a - b;
        }

        System.out.println("After Swap:");
        System.out.println("a = " + a + ", b = " + b);
    }
}
