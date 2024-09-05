package Assignment_2;

import static Assignment_2.utilities.inputNumberAndString.InputString;

public class WeekDays {
    public static void main(String[] args) {
        String input = InputString();
        weekDays(input);
    }

    private static void weekDays(String input){
        input = input.toLowerCase();
        if(input.equals("monday") || input.equals("tuesday") || input.equals("wednesday") || input.equals("thursday") ||input.equals("friday")){
            System.out.println(input.toUpperCase() + " is WeekDay.");
        }else if(input.equals("saturday") || input.equals("sunday")){
            System.out.println(input.toUpperCase() + " is WeekEnd");
        }else{
            System.out.println("It is neither WeekDay or WeekEnd");
        }
    }
}
