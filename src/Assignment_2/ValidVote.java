package Assignment_2;

import static Assignment_2.utilities.inputNumberAndString.InputNumber;

public class ValidVote {
    public static void main(String[] args) {
        int age = InputNumber();
        validVote(age);
    }
    private static void validVote(int age){
        if (age > 18){
            System.out.println("You are valid to vote.");
        }else{
            System.out.println("You are not valid to vote. You must be at least 18 year of Old.");
        }
    }
}
