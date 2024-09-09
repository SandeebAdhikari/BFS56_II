package Assignment_3.utilities;
import java.util.Scanner;

public class Utilities {

    private static Scanner scanner = new Scanner(System.in);

    public static int InputNumber() {
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        scanner.close();
        return number;
    }

    public static String InputString() {
        System.out.print("Enter your input: ");
        String string = scanner.nextLine();
        scanner.close();
        return string;
    }
}
