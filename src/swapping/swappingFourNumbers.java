package swapping;

public class swappingFourNumbers {
    public static void main(String[] args) {
        swappingFourNumber(1,2,3,4);
    }

    private static void swappingFourNumber(int a, int b, int c, int d) {
        System.out.println("Value of A:" + a);
        System.out.println("Value of B:" + b);
        System.out.println("Value of C:" + c);
        System.out.println("Value of D:" + d);
        System.out.println("------------------------");

        int temp1 = a;
        a = d;
        d = temp1;

        int temp2 = b;
        b = c;
        c = temp2;

        System.out.println("Value of A:" + a);
        System.out.println("Value of B:" + b);
        System.out.println("Value of C:" + c);
        System.out.println("Value of D:" + d);
        System.out.println("------------------------");
    }
}
