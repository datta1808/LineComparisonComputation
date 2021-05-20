package com.bridgelabz;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation");

        // Initializing the co-ordinates for line 1
        int x1=1, x2=4, y1=1, y2=4;
        // Initializing the co-ordinates for line 2
        int a1=1, a2=5, b1=1, b2=5;

        // Calculating the length of line
        Double lengthOfLine1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        Double lengthOfLine2 = Math.sqrt(Math.pow(a2 - a1, 2) + Math.pow(b2 - b1, 2));

        // Printing the length of lines
        System.out.println("The length of line 1 is: " +lengthOfLine1);
        System.out.println("The length of line 2 is: " +lengthOfLine2);

        // Comparing the lengths of the lines using 'equals' method
        if (lengthOfLine1.equals(lengthOfLine2)) {
            System.out.println("Both the lines are equal");
        } else {
            System.out.println("Both the lines are not equal");
        }
    }
}
