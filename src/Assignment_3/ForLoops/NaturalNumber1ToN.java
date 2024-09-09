package Assignment_3.ForLoops;

import static Assignment_3.utilities.Utilities.InputNumber;

public class NaturalNumber1ToN {
    public static void main(String[] args) {
        int num = InputNumber();
        naturalNumber1toN(num);
    }
    private static void naturalNumber1toN(int num){
        System.out.println("The natural number from 1 to " + num + ":");
        for(int i = 1; i<= num; i ++){
            System.out.println(i);
        }
    }
}
