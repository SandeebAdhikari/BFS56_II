package Assignment_2;
import java.util.Random;

import static Assignment_2.utilities.inputNumberAndString.InputNumber;

public class MaximumInThreeNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(100);
        int b = rand.nextInt(100);
        int c =  rand.nextInt(100);
        System.out.println("a = " + a + ", b = " + b + " c = " + c );
        maximumInThreeNumber(a,b,c);
    }
    public static void maximumInThreeNumber(int a, int b, int c) {
        if(a>b && a>c){
            System.out.println("Maximum number is "+a);
        }else if(b>a && b>c){
            System.out.println("Maximum number is "+b);
        }else {
            System.out.println("Maximum number is " + c);
        }
    }
}
