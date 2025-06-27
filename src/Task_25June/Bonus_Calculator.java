package Task_25June;
/*
Calculate Bonus Based on Salary and Years of Experience.
* Take the salary and Year info from the User.

Implement Bonus Calculation Logic:

Define the bonus structure based on salary and years of experience.

If years of experience is less than 1 year: No bonus.
If years of experience is between 1 and 3 years: Bonus is 5% of the salary.
If years of experience is between 4 and 6 years: Bonus is 10% of the salary.
If years of experience is greater than 6 years: Bonus is 15% of the salary.
*/

import java.util.Scanner;

public class Bonus_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input salary and years of experience
        System.out.print("Enter your Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter your Years of Experience: ");
        double years = sc.nextDouble();

        double bonus = 0;

        if (salary <= 0) {
            System.out.println("Invalid salary. Salary must be a positive number.");
        } else if (years < 0) {
            System.out.println("Invalid experience. Years cannot be negative.");
        } else {
            // Calculate bonus based on years of experience
            if (years < 1) {
                bonus = 0;
            } else if (years >= 1 && years <= 3) {
                bonus = salary * 0.05;
            } else if (years >= 4 && years <= 6) {
                bonus = salary * 0.10;
            } else {
                bonus = salary * 0.15;
            }

            System.out.printf("Your bonus is: ₹%.2f%n", bonus);
        }

        sc.close();
    }
}
