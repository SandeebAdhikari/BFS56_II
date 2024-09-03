package swapping;

public class swappingFourNumberWithoutTemp {
    public static void main(String[] args) {
        swappingFourNumbersWithoutTemps(1,2,3,4);
    }

    private static void swappingFourNumbersWithoutTemps(int a, int b, int c, int d) {
        System.out.println("Value of A:" + a);
        System.out.println("Value of B:" + b);
        System.out.println("Value of C:" + c);
        System.out.println("Value of D:" + d);
        System.out.println("------------------------");


          d = a + b + c + d;
          c = d - (a + b + c);
          b = d - (a + b + c);
          a = d - (a + b + c);
          d = d - (a + b + c);


        System.out.println("Value of A:" + a);
        System.out.println("Value of B:" + b);
        System.out.println("Value of C:" + c);
        System.out.println("Value of D:" + d);
        System.out.println("------------------------");
    }
}
