package Assignment_2;

import static Assignment_2.utilities.inputNumberAndString.InputNumber;

public class ConvertCelsiusToFahrenheit {
    public static void main(String[] args) {
        double celsius = InputNumber();
        convertCelsiusToFahrenheit(celsius);
    }
    private static void convertCelsiusToFahrenheit(double celsius){
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.printf("%.2f °C = %.2f °F",celsius, fahrenheit);
    }
}
