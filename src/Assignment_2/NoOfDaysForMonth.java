package Assignment_2;

import static Assignment_2.utilities.inputNumberAndString.InputString;

public class NoOfDaysForMonth {
    public static void main(String[] args) {
        String month = InputString();
        noOfDaysForMonth(month);
    }

    private static void noOfDaysForMonth(String month) {
        month = month.toLowerCase();

        switch (month) {
            case "january":
            case "1":
                System.out.println("Days = 31");
                break;
            case "february":
            case "2":
                System.out.println("Days = 28 or 29 (leap year)");
                break;
            case "march":
            case "3":
                System.out.println("Days = 31");
                break;
            case "april":
            case "4":
                System.out.println("Days = 30");
                break;
            case "may":
            case "5":
                System.out.println("Days = 31");
                break;
            case "june":
            case "6":
                System.out.println("Days = 30");
                break;
            case "july":
            case "7":
                System.out.println("Days = 31");
                break;
            case "august":
            case "8":
                System.out.println("Days = 31");
                break;
            case "september":
            case "9":
                System.out.println("Days = 30");
                break;
            case "october":
            case "10":
                System.out.println("Days = 31");
                break;
            case "november":
            case "11":
                System.out.println("Days = 30");
                break;
            case "december":
            case "12":
                System.out.println("Days = 31");
                break;
            default:
                System.out.println("Invalid month input.");
                break;
        }
    }
}
