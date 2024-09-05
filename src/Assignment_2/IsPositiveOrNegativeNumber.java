package Assignment_2;


import static Assignment_2.utilities.inputNumberAndString.InputString;

public class IsPositiveOrNegativeNumber {
    public static void main(String[] args) {
        String input = InputString();
        isPositiveOrNegativeNumber(input);
    }
    private static void isPositiveOrNegativeNumber(String input){
        char userInput = input.charAt(0);
        if (userInput== '-') {
            System.out.println(input + " is negative number.");
        }else{
            System.out.println(input + " is positive number");
        }
    }
}
