package Assignment_2;

import static Assignment_2.utilities.inputNumberAndString.InputString;


public class IsDigitOrAlphabetOrSpecialCharacter {
    public static void main(String[] args) {
        var value = InputString();
        isDigitOrAlphabetOrSpecialCharacter(value);
    }

    private static void isDigitOrAlphabetOrSpecialCharacter(String input) {
        char userInput = input.charAt(0);
        if ( Character.isDigit(userInput)){
            System.out.println(userInput + " is Digit.");
        }else if(Character.isLetter(userInput)){
            System.out.println(userInput+" is Alphabet.");
        }else{
            System.out.println(userInput+" is Special character.");
        }
    }
}
