package Assignment_3.ForLoops;



import static Assignment_2.utilities.inputNumberAndString.InputNumber;

public class FactorsOfNumber {
    public static void main(String[] args) {
        int num = InputNumber();

        System.out.print("Factors of " + num + ": ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
