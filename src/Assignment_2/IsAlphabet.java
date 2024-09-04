package Assignment_2;


import static Assignment_2.utilities.inputNumberAndString.InputString;

public class IsAlphabet {
    public static void main(String[] args) {
        String value = InputString();
        isAlphabet(value);
    }

    private static void isAlphabet(String inputString) {
        boolean isAlphabet = true;

        for (int i = 0; i < inputString.length(); i++) {
            if (!Character.isLetter(inputString.charAt(i))) {
                isAlphabet = false;
                break;
            }
        }

        if (isAlphabet) {
            System.out.println("The input contains only alphabets.");
        } else {
            System.out.println("The input contains non-alphabet characters.");
        }
    }
}
