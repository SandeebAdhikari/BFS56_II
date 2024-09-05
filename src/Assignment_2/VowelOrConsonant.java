package Assignment_2;

import static Assignment_2.utilities.inputNumberAndString.InputString;

public class VowelOrConsonant {
    public static void main(String[] args) {
        String input = InputString();
        vowelOrConsonant(input);
    }

    private static void vowelOrConsonant(String input){
        input = input.toLowerCase();
        if(input.equals("a") || input.equals("e") || input.equals("i") || input.equals("o") || input.equals("u")){
            System.out.println(input + " is Vowel.");
        }else{
            System.out.println(input + " is Consonant.");
        }
    }
}
