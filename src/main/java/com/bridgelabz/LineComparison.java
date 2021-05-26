package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {

    double x1, x2, y1, y2;
    Double lengthOfLine;
    Double line1, line2;

    // method to enter the values of co-ordinates
    public void values() {
        System.out.println("Enter values of points: x1, x2, y1, y2");
        // user inputs
        Scanner point = new Scanner(System.in);
        x1 = point.nextDouble();
        x2 = point.nextDouble();
        y1 = point.nextDouble();
        y2 = point.nextDouble();
        System.out.println("The co-ordinates are: (" + x1 + ", " + y1 + ")" + "(" + x2 + "," + y2 + ")");
    }

    // method to calculate length of the line
    public void lengthCalculation() {
        lengthOfLine = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }


    // method to check equality of lines
    public void equalityCheck() {
        System.out.println("For line 1: ");
        values();
        lengthCalculation();
        line1 = lengthOfLine;
        System.out.println("length of line 1 = " + line1);

        System.out.println("For line 2: ");
        values();
        lengthCalculation();
        line2 = lengthOfLine;
        System.out.println("length of line 2 = " + line2);
    }


    // method to compare the length of lines
    public void compareLength() {
        int lengthCheck = line1.compareTo(line2);
        switch (lengthCheck) {
            case 0:
                System.out.println("Line 1 is equal to line 2");
                break;
            case 1:
                System.out.println("Line 1 is greater than line 2");
                break;
            default:
                System.out.println("Line 2 is greater than line 1");
                break;
        }
    }

    // main method
    public static void main(String[] args) {
        //Object creation
        LineComparison lines = new LineComparison();
            lines.equalityCheck();
            lines.compareLength();
    }
}
