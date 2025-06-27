package Task_25June;
/*
Find if a Person Can Travel Based on Visa Status and Age.
*Take the input from the user for
Age (integer).
Visa Status (String or boolean).
Check Eligibility: If age is 18 or older and visa status is valid, the person can travel.
Otherwise, the person cannot travel.

Validation Criteria
Age: - Must be a non-negative integer.
Should be greater than or equal to 18 to be eligible to travel.

Visa Status :- Must be a valid string indicating the visa status (e.g., "valid" or "invalid").
You can also use a boolean where true indicates a valid visa and false indicates an invalid visa.
*/

import java.util.Scanner;

public class TravelEligibilityChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Age
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        // Input Visa Status
        System.out.print("Enter your visa status (valid/invalid): ");
        String visaStatus = sc.nextLine().trim().toLowerCase();

        // Validation & Eligibility Check
        if (age < 0) {
            System.out.println("Invalid age. Age cannot be negative.");
        } else if (age < 18) {
            System.out.println("You must be at least 18 years old to travel.");
        } else if (!visaStatus.equals("valid") && !visaStatus.equals("invalid")) {
            System.out.println("Invalid visa status input. Please enter 'valid' or 'invalid'.");
        } else if (age >= 18 && visaStatus.equals("valid")) {
            System.out.println("✅ You are eligible to travel.");
        } else {
            System.out.println("❌ You are not eligible to travel.");
        }

        sc.close();
    }
}
