package swapping;

public class swappingThreeNumbersWithoutTemp {
    public static void main(String[] args) {
        swappingThreeNumbersWithoutTemps(1, 2, 3);
    }

    public static void swappingThreeNumbersWithoutTemps(int a, int b, int c) {
        System.out.println("Value of A:" + a);
        System.out.println("Value of B:" + b);
        System.out.println("Value of C:" + c);
        System.out.println("------------------------");

       //swapping a and c
        a = a + c;
        c = a - c;
        a = a - c;

        //swapping b and a
        b = b + a;
        a = b - a;
        b = b - a;





        System.out.println("Value of A:" + a);
        System.out.println("Value of B:" + b);
        System.out.println("Value of C:" + c);
        System.out.println("------------------------");


    }
}
