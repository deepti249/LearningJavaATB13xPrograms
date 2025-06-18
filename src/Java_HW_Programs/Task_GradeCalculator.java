package Java_HW_Programs;

/*Grade Calculator:

Write a program that calculates and displays the letter grade for a given numerical
score (e.g., A, B, C, D, or F) based on the following grading scale:
A: 90-100
B: 80-89
C: 70-79
D: 60-69
F: 0-59 */

import java.util.Scanner;

public class Task_GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for score
        System.out.print("Enter the numerical score (0-100): ");
        int score = scanner.nextInt();

        // Check score range and determine grade
        if (score >= 90 && score <= 100) {
            System.out.println("Grade: A");
        } else if (score >= 80 && score <= 89) {
            System.out.println("Grade: B");
        } else if (score >= 70 && score <= 79) {
            System.out.println("Grade: C");
        } else if (score >= 60 && score <= 69) {
            System.out.println("Grade: D");
        } else if (score >= 0 && score <= 59) {
            System.out.println("Grade: F");
        } else {
            System.out.println("Invalid score! Please enter a number between 0 and 100.");
        }

        scanner.close();
    }
}
