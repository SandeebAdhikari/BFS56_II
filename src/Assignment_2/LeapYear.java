package Assignment_2;

import static Assignment_2.utilities.inputNumberAndString.InputNumber;

public class LeapYear {
    public static void main(String[] args) {
        int year = InputNumber();
        isLeapYear(year);
    }

    private static void isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a leap year");
        }
    }
}
