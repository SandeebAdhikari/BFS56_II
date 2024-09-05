package Assignment_2;

import java.util.Scanner;

public class ShapeOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the lenth1: ");
        int length1 = input.nextInt();
        System.out.println("Enter the lenth2: ");
        int length2 = input.nextInt();
        System.out.println("Enter the lenth3: ");
        int length3 = input.nextInt();

        shapeOfTriangle(length1, length2, length3);
        input.close();
    }

    private static void shapeOfTriangle(int length1, int length2, int length3){
        if(length1 == length2 && length2 == length3){
            System.out.println("The all side length is " + length1 + ". Therefore, it is Equilateral Triangle.");
        }else if (length1 == length2 || length2 == length3 || length1 == length3) {
            System.out.println("It is an Isosceles Triangle.");
        } else {
            System.out.println("It is a Scalene Triangle.");
        }
    }
}