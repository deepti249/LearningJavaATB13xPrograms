package Task_25June;
/*
Check if a Person is Eligible for a Loan (Based on Age, Salary, and Credit Score)

* Take the below User info and store it into the variables:
Age (integer),Salary (double or float) and Credit Score (integer)

Age Validation:Check if the age is a positive integer.
Ensure the age is at least 18 years old.
Max age can be 80.

Salary Validation:Check if the salary is a positive number.
Define a minimum salary threshold (e.g., 30,000).

Credit Score Validation:Check if the credit score is a positive integer.
Define a minimum credit score threshold (e.g., 650).
Max credit score threshold (e.g., 850).
 */

import java.util.Scanner;

public class LoanEligibilityChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter your Age: ");
        int age = sc.nextInt();

        System.out.print("Enter your Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter your Credit Score: ");
        int creditScore = sc.nextInt();

        // Age validation
        if (age <= 0) {
            System.out.println("Invalid age. Age must be a positive number.");
        } else if (age < 18) {
            System.out.println("You are too young for a loan.");
        } else if (age > 80) {
            System.out.println("You are too old for a loan.");
        }
        // Salary validation
        else if (salary <= 0) {
            System.out.println("Invalid salary. Salary must be a positive number.");
        } else if (salary < 30000) {
            System.out.println("Your salary is too low for loan eligibility.");
        }
        // Credit score validation
        else if (creditScore <= 0) {
            System.out.println("Invalid credit score. Must be a positive integer.");
        } else if (creditScore < 650) {
            System.out.println("Your credit score is too low for loan eligibility.");
        } else if (creditScore > 850) {
            System.out.println("Invalid credit score. Maximum allowed is 850.");
        }
        // If all conditions pass
        else {
            System.out.println("✅ You are eligible for a loan!");
        }

        sc.close();
    }
}
