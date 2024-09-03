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

        int temp = a;
        a = b;
        b = c ;
        c = d;
        d = temp;

        System.out.println("Value of A:" + a);
        System.out.println("Value of B:" + b);
        System.out.println("Value of C:" + c);
        System.out.println("Value of D:" + d);
        System.out.println("------------------------");
    }
}
