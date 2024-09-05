package Assignment_2;

import java.util.Scanner;

public class PercentageAndGradeOfStudent {
    public static void main(String[] args) {
        Scanner marks = new Scanner(System.in);
        System.out.println("**********MARKS**********");
        System.out.println("Math:  ");
        double Math = marks.nextDouble();
        System.out.println("Physics: ");
        double Physics = marks.nextDouble();
        System.out.println("Chemistry: ");
        double Chemistry = marks.nextDouble();
        System.out.println("English: ");
        double English = marks.nextDouble();
        System.out.println("Nepali: ");
        double Nepali = marks.nextDouble();

        checkDivision(Math, Physics, Chemistry, English, Nepali);
        marks.close();
    }

    private static void checkDivision(double Math, double Physics, double Chemistry, double English, double Nepali) {
        double totalMarks = Math + Physics + Chemistry + English + Nepali;
        double percentage = (totalMarks / 500) * 100;
        if (percentage >= 90) {
            System.out.println("Grade A");
        } else if (percentage >= 80) {
            System.out.println("Grade B");
        } else if (percentage >= 70) {
            System.out.println("Grade C");
        }else if (percentage >= 60) {
            System.out.println("Grade D");
        } else if (percentage >= 40) {
            System.out.println("Grade E");
        }else {
            System.out.println("Grade F");
        }
    }
}