package Assignment_2;

import java.util.Scanner;

public class CheckDivision {
    public static void main(String[] args) {
        Scanner marks = new Scanner(System.in);
        System.out.println("**********MARKS**********");
        System.out.println("Intro To RoadMap Python: ");
        double introToRoadMap = marks.nextDouble();
        System.out.println("DSA: ");
        double DSA = marks.nextDouble();
        System.out.println("DataBase: ");
        double dataBase = marks.nextDouble();
        System.out.println("DiscreteMath: ");
        double discreteMath = marks.nextDouble();
        System.out.println("CalculusOne: ");
        double calculusOne = marks.nextDouble();

        checkDivision(introToRoadMap, DSA, dataBase, discreteMath, calculusOne);
        marks.close();
    }

    private static void checkDivision(double introToRoadMap, double DSA, double dataBase, double discreteMath, double calculusOne) {
        double totalMarks = introToRoadMap + DSA + dataBase + discreteMath + calculusOne;
        double percentage = (totalMarks / 500) * 100;

        if (percentage >= 60) {
            System.out.println("First Division");
        } else if (percentage >= 45) {
            System.out.println("Second Division");
        } else if (percentage >= 30) {
            System.out.println("Third Division");
        } else {
            System.out.println("Fail");
        }
    }
}
