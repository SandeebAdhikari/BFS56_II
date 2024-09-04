package Assignment_2;
import java.util.Random;
public class MaximumNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(100);
        int b = rand.nextInt(100);
        System.out.println("a = " + a + ", b = " + b );
        maximumNumber(a,b);
    }

    private static void maximumNumber(int a, int b){
        if (a>b){
            System.out.println("Maximum number is "+a);
        }else{
            System.out.println("Maximum number is "+b);
        }
    }
}
