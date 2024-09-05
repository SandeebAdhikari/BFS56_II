package Assignment_2;

import static Assignment_2.utilities.inputNumberAndString.InputString;

public class UpperCaseOrLowerCase {
    public static void main(String[] args) {
        String input = InputString();
        upperCaseOrLoweCase(input);
    }

    private static void upperCaseOrLoweCase(String input){
        if(input.equals(input.toUpperCase())){
            System.out.println(input + " is Uppercase.");
        }else{
            System.out.println(input + " is Lowercase.");
        }
    }

}
