package Assignment_1;

public class Swapping {
    public static void main(String[] args) {
        swapTwoNumberUsingTemp(4,3);
        swapTwoNumberWithoutUsingTemp(4, 3);

    }
    private static void swapTwoNumberUsingTemp(int a, int b) {
        System.out.println("Value of A:" + a);
        System.out.println("Value of B:" + b);
        System.out.println("------------------------");
        int temp = a;
        a = b;
        b= temp;
        temp = 0;
        System.out.println("Value of A:" + a);
        System.out.println("Value of B:" + b);
    }

    private static void swapTwoNumberWithoutUsingTemp(int a, int b) {

        System.out.println("Value of A:" + a);
        System.out.println("Value of B:" + b);
        System.out.println("------------------------");
         a = a + b;
         b = a - b ;
         a = a - b ;
        System.out.println("Value of A:" + a);
        System.out.println("Value of B:" + b);
    }
}
