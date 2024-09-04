package Assignment_2;


import static Assignment_2.utilities.inputNumberAndString.InputString;

public class IsDigit {
    public static void main(String[] args) {
        String value = InputString();
        isDigit(value);
    }
    private static void isDigit(String value) {
       try{
            Integer.parseInt(value);
            System.out.println(value + " is not a valid integer");
        } catch (NumberFormatException e) {
            System.out.println(value + " is not a valid integer");
        }
    }
}
