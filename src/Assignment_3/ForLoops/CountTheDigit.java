package Assignment_3.ForLoops;

//import static Assignment_3.utilities.Utilities.InputNumber;
import static Assignment_3.utilities.Utilities.InputString;

public class CountTheDigit {
    public static void main(String[] args) {
        String num = InputString();
        countTheDigit(num);
    }
    private static void countTheDigit(String num){
        int count = 0;
        for(int i = 0; i < num.length() ;i++){
            count++;
        }
        System.out.println(count);
    }
}

